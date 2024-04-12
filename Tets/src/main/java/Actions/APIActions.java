package Actions;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured;

public class APIActions {
    String BaseURI;
    String Endpoint1;
    RequestSpecification<OTP_Secreen> request;

    public String getActions(String url, String resource, String body){
        RestAssured.baseURI = url+resource;
        Response response = request.body(body).get();
        return response.prettyPeek().toString();
    }

}
