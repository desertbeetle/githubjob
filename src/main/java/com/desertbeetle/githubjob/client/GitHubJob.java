package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.Constants;
import com.desertbeetle.githubjob.model.PercentInfo;
import com.desertbeetle.githubjob.model.JobsSummary;
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
    public void runNormal() throws SvcException{
        JobsSummary summary = new JobsSummary();

        for (String loc : locations) {
            System.out.println("Checking jobs near " + loc + "...");
            for (String lang : languages) {
                System.out.println("\tChecking " + lang + " job near " + loc);
                double percent = jobController.getPercentOfJob(loc, lang);
                summary.add(loc, -1, lang, -1, percent);
            }
        }
        System.out.println(summary.getConsoleOutput());
    }

    public void runImprove() throws SvcException {
        JobsSummary summary = new JobsSummary();
        for (String loc : locations) {
            PercentInfo[] percentInfos = jobController.getPercentInfoOfJob(loc, Constants.LANGUAGES);
            for (int i = 0; i < percentInfos.length; i++) {
                summary.add(loc, percentInfos[i].getTotal(), Constants.LANGUAGES[i], percentInfos[i].getObtained(), percentInfos[i].getPercent());
            }
        }
        System.out.println(summary.getConsoleOutput());
    }
}
