package com.desertbeetle.githubjob;

public interface GitHubJobSvc {
    Job[] getAllJobs();
    Job[] getAllJobs(String loc);
    Job[] getAllJobs(String loc, String lang);
}
