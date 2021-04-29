package com.desertbeetle.githubjob;

import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;

public class ControllerTest {

    @Test
    public void zeroPercentTest() {
        GitHubJobSvc svc = new GitHubJobSvcImpl();
        GitHubJobSvc spy = Mockito.spy(svc);
        Mockito.doReturn(new Job[0]).when(spy).getAllJobs();
        Mockito.doReturn(new Job[0]).when(spy).getAllJobs(Mockito.anyString());
        Mockito.doReturn(new Job[0]).when(spy).getAllJobs(Mockito.anyString(),Mockito.anyString());
        JobController controller = new JobController(spy);
        String loc = "irrivalent";
        String lang = "irrivalent";
        double percentage = controller.getPercentOfJob(lang, loc);
        assertEquals(0.0, percentage);
    }
    @Test
    public void oneHundredPercentTest() {
        GitHubJobSvc svc = new GitHubJobSvcImpl();
        GitHubJobSvc spy = Mockito.spy(svc);
        Job[] jobs = new Job[10];
        Mockito.doReturn(jobs).when(spy).getAllJobs();
        Mockito.doReturn(jobs).when(spy).getAllJobs("loc1");
        Mockito.doReturn(jobs).when(spy).getAllJobs("loc1", "Java");
        JobController controller = new JobController(spy);
        double percentage = controller.getPercentOfJob("loc1", "Java");
        assertEquals(100.0, percentage);
    }

    @Test
    public void mixTest() {
        GitHubJobSvc svc = new GitHubJobSvcImpl();
        GitHubJobSvc spy = Mockito.spy(svc);
        Job[] jobs = new Job[10];
        Mockito.doReturn(new Job[10]).when(spy).getAllJobs();

        Mockito.doReturn(new Job[3]).when(spy).getAllJobs("loc1");
        Mockito.doReturn(new Job[3]).when(spy).getAllJobs("loc1", "Java");
        Mockito.doReturn(new Job[3]).when(spy).getAllJobs("loc1", "Kotlin");
        Mockito.doReturn(new Job[3]).when(spy).getAllJobs("loc1", "C#");

        Mockito.doReturn(new Job[7]).when(spy).getAllJobs("loc2");
        Mockito.doReturn(new Job[3]).when(spy).getAllJobs("loc2", "Java");
        Mockito.doReturn(new Job[4]).when(spy).getAllJobs("loc2", "Kotlin");
        Mockito.doReturn(new Job[5]).when(spy).getAllJobs("loc2", "C#");


        JobController controller = new JobController(spy);
        assertEquals(100.0, controller.getPercentOfJob("loc1", "Java"));
        assertEquals(100.0, controller.getPercentOfJob("loc1", "Kotlin"));
        assertEquals(100.0, controller.getPercentOfJob("loc1", "C#"));
        assertEquals(3/7*100.0, controller.getPercentOfJob("loc2", "Java"));
        assertEquals(4/7*100.0, controller.getPercentOfJob("loc2", "Kotlin"));
        assertEquals(5/7*100.0, controller.getPercentOfJob("loc2", "C#"));


    }

}
