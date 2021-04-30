package com.desertbeetle.githubjob.svc;

import com.desertbeetle.githubjob.Constants;
import com.desertbeetle.githubjob.util.URIUtil;
import com.desertbeetle.githubjob.model.Job;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Consume GitHubJobs Restful API using Java URL connection.
 * A new connection to the service endpoint is created on every call.
 */
public class RestClient {

    //
    // Public methods
    //

    public Job[] getJobs(String loc) throws  SvcException {
        return getJobs(loc, null);
    }

    public Job[] getJobs(String loc, String lang) throws SvcException {
        Gson gson = new Gson();
        String s = getJobsInJSONString(loc, lang);
        return  gson.fromJson(s, Job[].class);
    }

    //
    // Protected methods
    //
    protected String getJobsInJSONString(String loc, String lang) throws SvcException {

            String uri = Constants.REST_URI;
            uri += URIUtil.getQueryString(loc, lang);


            try {
                URL url = new URL(uri);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(
                        (conn.getInputStream())));

                String output;
                StringBuffer buf = new StringBuffer();
                while ((output = br.readLine()) != null) {
                    buf.append(output);
                }

                return buf.toString();
            } catch (IOException ioe ) {
                throw new SvcException(ioe);
            }
    }

    //
    // Static method
    //

    // Quick test
    public static void main(String[] args) {
        try {
            RestClient client = new RestClient();
            String loc = "New York";
            Job[] jobs = client.getJobs(loc, "Java");
            System.out.println("There are " + jobs.length + " jobs near " + loc + " area");
            for (Job j : jobs) {
                System.out.println(j.getTitle());
                System.out.println(j.getLocation());
            }
        } catch (SvcException e) {
            e.printStackTrace();
        }
    }


}