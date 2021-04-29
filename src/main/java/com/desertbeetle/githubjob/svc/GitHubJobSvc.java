package com.desertbeetle.githubjob.svc;

import com.desertbeetle.githubjob.model.Job;

public interface GitHubJobSvc {
    Job[] getAllJobs();
    Job[] getAllJobs(String loc);
    Job[] getAllJobs(String loc, String lang);
}
