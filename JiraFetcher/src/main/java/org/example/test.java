package org.example;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.SearchRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;

public class JiraTicketFetcher1 {

    private final JiraRestClient restClient;

    public JiraTicketFetcher(String jiraUrl, String username, String password) {
        AsynchronousJiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
        restClient = factory.createWithBasicAuthentication(jiraUrl, username, password);
    }

    public Issue fetchTicketByJQL(String jql) throws Exception {
        SearchRestClient searchRestClient = restClient.getSearchClient();
        Promise<SearchResult> searchResultPromise = searchRestClient.searchJql(jql);
        SearchResult searchResult = searchResultPromise.claim();
        if (searchResult.getTotal() == 0) {
            return null;
        }
        return searchResult.getIssues().get(0);
    }
}
