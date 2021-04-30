package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.model.Job;
import com.desertbeetle.githubjob.util.StringUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class JobTest {

    @Test
    public void jobDescriptionKeywordMatchingIsCaseInsensitiveTest() {
        Job job = new Job("1");
        job.setDescription("About the Opportunity: The Lead Developer " +
                "for Design excels in HTML5, PHP (Wordpress in particular), " +
                "CSS3 and JavaScript. ");
        String[] keywords = {"Javascript", "JavaScript", "JavaSCript"};
        for (String keyword : keywords) {
            assertTrue(job.descriptionMatchesKeyword(keyword));
        }
    }
}
