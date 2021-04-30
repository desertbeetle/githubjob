package com.desertbeetle.githubjob.svc;

import com.desertbeetle.githubjob.model.Job;

/**
 *  Defines the functions of GitHubJobs
 */
public interface GitHubJobSvc {

    /**
     * Returns all jobs.
     *
     * @return
     * @throws SvcException
     */
    Job[] getAllJobs() throws SvcException;

    /**
     * Returns all jobs near a specified location
     *
     * @param loc
     * @return
     * @throws SvcException
     */
    Job[] getAllJobs(String loc) throws SvcException;

    /**
     * Returns all jobs with specified programming language requirement near specified location.
     * @param loc
     * @param lang
     * @return
     * @throws SvcException
     */
    Job[] getAllJobs(String loc, String lang) throws SvcException;
}
