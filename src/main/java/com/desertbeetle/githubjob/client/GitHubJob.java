package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.Constants;
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
    public void run() throws SvcException{

        for (String loc : locations) {
            System.out.println(loc + ":");
            double[] values = jobController.getPercentOfJob(loc, Constants.LANGUAGES);
            for (int i = 0; i < values.length; i++) {
                System.out.println("- " + Constants.LANGUAGES[i] + ": " + TextUtil.twoDecimal(values[i]) + "%");

            }
        }
//            for (String lang : languages) {
//                try {
//                    double percent = jobController.getPercentOfJob(loc, lang);
//                    System.out.println("- " + lang + ": " + TextUtil.twoDecimal(percent) + "%");
//                } catch (SvcException e) {
//                    System.out.println("- " + lang + ": " + -1 + "%");
//                }
//            }
//        }
    }
}
