package com.desertbeetle.githubjob.control;

import com.desertbeetle.githubjob.model.PercentInfo;
import com.desertbeetle.githubjob.model.Job;
import com.desertbeetle.githubjob.util.MathUtil;
import com.desertbeetle.githubjob.svc.GitHubJobSvc;
import com.desertbeetle.githubjob.svc.SvcException;

/**
 * The controller class is responsible for calculating the percentage.
 */
public class JobController {

    //
    // Instance Variables
    //
    GitHubJobSvc gitHubJobSvc;

    //
    // Constructor
    //
    public JobController(GitHubJobSvc gitHubJobSvc) {
        this.gitHubJobSvc = gitHubJobSvc;
    }

    //
    // Public methods
    //

    /**
     * Returns the percentage of jobs near a location with specified language requirement
     * @param loc   Location name
     * @param lang  Language name
     */
    public double getPercentOfJob(String loc, String lang) throws SvcException {

        int totalJobCount = gitHubJobSvc.getAllJobs(loc).length;
        if (totalJobCount == 0) {
            return 0;
        }
        int specJobCount = gitHubJobSvc.getAllJobs(loc, lang).length;
        double percent = MathUtil.calcPercent(specJobCount, totalJobCount);

        return percent;
    }


    public PercentInfo[] getPercentInfoOfJob(String loc, String[] lang ) throws SvcException {
        Job[] jobs = gitHubJobSvc.getAllJobs(loc);
        int total = jobs.length;
        PercentInfo[] percentInfos = new PercentInfo[lang.length];
        int matched = 0;
        double percent;
        int i = 0;
        for (String l : lang) {
            matched = 0;
            for (Job j : jobs) {
                if (j.descriptionMatchesKeyword(l)) {
                    matched ++;
                }
            }

            percent = MathUtil.calcPercent(matched, total);
            percentInfos[i++] = new PercentInfo(matched, total, percent);
        }

        return percentInfos;

    }



}
