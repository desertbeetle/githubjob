package com.desertbeetle.githubjob;

public class JobController {

    GitHubJobSvc gitHubJobSvc;

    public JobController(GitHubJobSvc gitHubJobSvc) {
        this.gitHubJobSvc = gitHubJobSvc;
    }

    /**
     * Returns the number of jobs near a location with specified language
     */
    int getJobCont(String loc, String lang){
        return 0;
    }



    /**
     * Returns all jobs near a location
     * @param loc
     * @return
     */
    int getJobCount(String loc) {
        return 0;
    }
}
