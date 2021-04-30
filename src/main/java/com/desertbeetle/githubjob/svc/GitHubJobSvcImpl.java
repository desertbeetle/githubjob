package com.desertbeetle.githubjob.svc;

import com.desertbeetle.githubjob.model.Job;

/**
 * The implementation class of GitHubJobSvc interface.
 */
public class GitHubJobSvcImpl implements GitHubJobSvc{

    @Override
    public Job[] getAllJobs() throws SvcException {
        return getAllJobs(null, null);
    }

    @Override
    public Job[] getAllJobs(String loc) throws SvcException {
        return getAllJobs(loc, null);
    }

    @Override
    public Job[] getAllJobs(String loc, String lang) throws SvcException {

        RestClient client = new RestClient();
        return client.getJobs(loc, lang);

    }
}
