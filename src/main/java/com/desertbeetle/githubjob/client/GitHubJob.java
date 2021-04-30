package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.util.TextUtil;
import com.desertbeetle.githubjob.svc.GitHubJobSvcImpl;
import com.desertbeetle.githubjob.control.JobController;
import com.desertbeetle.githubjob.svc.SvcException;


/**
 * The main starting point. Call the run() method to start.
 */
public class GitHubJob {

    //
    // Instance variables
    //

    String[] locations;
    String[] languages;
    JobController jobController;

    //
    // Constructor
    //

    public GitHubJob(String[] locations, String[] languages) {
        this.locations = locations;
        this.languages = languages;

        jobController = new JobController(new GitHubJobSvcImpl());
    }

    //
    // Public method
    //
    public void run() {

        for (String loc : locations) {
            System.out.println(loc+":");
            for (String lang : languages) {
                try {
                    double percent = jobController.getPercentOfJob(loc, lang);
                    System.out.println("- " + lang + ": " + TextUtil.twoDecimal(percent) + "%");
                } catch (SvcException e) {
                    System.out.println("- " + lang + ": " + -1 + "%");
                }
            }
        }
    }
}
