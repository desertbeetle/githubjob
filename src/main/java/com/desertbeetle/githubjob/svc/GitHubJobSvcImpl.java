package com.desertbeetle.githubjob.svc;

import com.desertbeetle.githubjob.model.Job;

public class GitHubJobSvcImpl implements GitHubJobSvc{
    @Override
    public Job[] getAllJobs() {
        return new Job[0];
    }

    @Override
    public Job[] getAllJobs(String loc) {
        return new Job[0];
    }

    @Override
    public Job[] getAllJobs(String loc, String lang) {
        return new Job[0];
    }
}
