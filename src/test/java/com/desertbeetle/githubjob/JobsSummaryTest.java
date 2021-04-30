package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.model.JobsSummary;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class JobsSummaryTest {

    @Test
    public void consoleOutputTest() {
        JobsSummary jobsSummary = new JobsSummary();
        jobsSummary.add("Boston", 10, "Java", 6, 66.67);
        jobsSummary.add("Boston", 10, "C#", 0, 0.0);
        jobsSummary.add("Boston", 10, "Python", 6, 66.67);
        jobsSummary.add("Boston", 10, "Swift", 0, 0.00);
        jobsSummary.add("Boston", 10, "Objective-C", 0, 0.0);
        jobsSummary.add("Boston", 10, "Ruby", 3, 33.33);
        jobsSummary.add("Boston", 10, "Kotlin", 0, 0.0);
        jobsSummary.add("Boston", 10, "Go", 6, 66.67);
        jobsSummary.add("Boston", 10, "C++", 3, 33.33);
        jobsSummary.add("Boston", 10, "Javascript", 3, 33.33);

        jobsSummary.add("San Francisco", 7, "Java", 1, 14.29);
        jobsSummary.add("San Francisco", 7, "C#", 0, 0.0);
        jobsSummary.add("San Francisco", 7, "Python", 4, 57.14);
        jobsSummary.add("San Francisco", 7, "Swift", 0, 0.0);
        jobsSummary.add("San Francisco", 7, "Objective-C", 0, 0.0);
        jobsSummary.add("San Francisco", 7, "Ruby", 0, 0.0);
        jobsSummary.add("San Francisco", 7, "Kotlin", 0, 0.0);
        jobsSummary.add("San Francisco", 7, "Go", 5, 71.43);
        jobsSummary.add("San Francisco", 7, "C++", 1, 14.29);
        jobsSummary.add("San Francisco", 7, "Javascript", 1, 14.29);

        String act = jobsSummary.getConsoleOutput();
        String exp="Boston:\n" +
                "- Java: 66.67%\n" +
                "- C#: 0.00%\n" +
                "- Python: 66.67%\n" +
                "- Swift: 0.00%\n" +
                "- Objective-C: 0.00%\n" +
                "- Ruby: 33.33%\n" +
                "- Kotlin: 0.00%\n" +
                "- Go: 66.67%\n" +
                "- C++: 33.33%\n" +
                "- Javascript: 33.33%\n" +
                "San Francisco:\n" +
                "- Java: 14.29%\n" +
                "- C#: 0.00%\n" +
                "- Python: 57.14%\n" +
                "- Swift: 0.00%\n" +
                "- Objective-C: 0.00%\n" +
                "- Ruby: 0.00%\n" +
                "- Kotlin: 0.00%\n" +
                "- Go: 71.43%\n" +
                "- C++: 14.29%\n" +
                "- Javascript: 14.29%\n";
        assertEquals(exp, act);
    }
}
