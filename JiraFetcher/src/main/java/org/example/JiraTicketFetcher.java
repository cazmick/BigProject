package org.example;

import com.atlassian.jira.issue.fields.rest.json.beans.JiraBaseUrls;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.httpclient.params.DefaultHttpParams;
import org.apache.commons.httpclient.params.HttpParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class JiraTicketFetcher {


    public static void main(String[] args) throws Exception {
        String jiraUrl = "https://infoedge.atlassian.net";
        String jiraUsername = "kanishka.mogha@naukri.com";
        String jiraPassword = "NaukriP@ssw0rd11";
        String jqlQuery = "project in (\"Recruiter Android App\", \"Android App\", \"Naukri India MNR\", \"Naukri India Resdex\", \"Central Communication System\") " +
                "and type = \"Change Request\" " +
                "and status = Approved " +
                "and created >= -5d " +
                "ORDER BY created DESC"; // Replace with your desired JQL query
        jqlQuery="project in Android App";
//        jqlQuery="project in Android%20App";
//        System.out.println(jqlQuery.length());
        RestAssured.baseURI=jiraUrl
                + "/rest/api/2/search" ;

//
        Response response1 = RestAssured.given().urlEncodingEnabled(true).queryParam("jql",jqlQuery).get().prettyPeek();


        //https://infoedge.atlassian.net/rest/api/2/search?jql=project in ("Recruiter Android App", "Android App", "Naukri India MNR", "Naukri India Resdex", "Central Communication System") and type = "Change Request" and status = Approved and created >= -1d ORDER BY created DESC
        //https://infoedge.atlassian.net/rest/api/2/search?jql=project in ("Recruiter Android App", "Android App", "Naukri India MNR", "Naukri India Resdex", "Central Communication System") and type = "Change Request" and status = Approved and created >= -5d ORDER BY created DESC
        try {

            HttpURLConnection huc =null;
            huc = (HttpURLConnection)(new URL(URLEncoder.encode(jiraUrl + "/rest/api/2/search?jql="+jqlQuery, StandardCharsets.UTF_8.toString())).openConnection());

            huc.setRequestMethod("HEAD");



            huc.connect();

            int respCode = huc.getResponseCode();
            HttpClient httpClient = HttpClients.createDefault();
            HttpParams params = null;
            params.setParameter("jql",jqlQuery);

//            HttpGet a=new HttpGet("https://infoedge.atlassian.net/rest/api/2/search?jql=project in ('Recruiter Android App')");
//            System.out.println(a.getURI());
            HttpGet httpGet = new HttpGet(new URI(jiraUrl + "/rest/api/2/search" ));
//           System.out.println( httpGet.getURI());

            // Set Jira credentials for basic authentication
            httpGet.setHeader("Authorization", "Basic " + getEncodedCredentials(jiraUsername, jiraPassword));

            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String responseJson = EntityUtils.toString(entity);
                System.out.println(responseJson); // Print the JSON response containing the Jira tickets
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to encode Jira credentials for basic authentication
    private static String getEncodedCredentials(String username, String password) {
        String credentials = username + ":" + password;
        return java.util.Base64.getEncoder().encodeToString(credentials.getBytes());
    }
}
