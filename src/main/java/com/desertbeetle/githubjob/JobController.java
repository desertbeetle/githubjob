package com.desertbeetle.githubjob;

public class JobController {

    GitHubJobSvc gitHubJobSvc;

    public JobController(GitHubJobSvc gitHubJobSvc) {
        this.gitHubJobSvc = gitHubJobSvc;
    }

    /**
     * Returns the percentage of jobs near a location with specified language requirement
     * @param loc   Location name
     * @param lang  Language name
     */
    double getPercentOfJob(String loc, String lang){
        int totalJobCount = gitHubJobSvc.getAllJobs(loc).length;
        if (totalJobCount == 0) {
            return 0;
        }
        int specJobCount = gitHubJobSvc.getAllJobs(loc, lang).length;
        return specJobCount / totalJobCount * 100.0;
    }



}
