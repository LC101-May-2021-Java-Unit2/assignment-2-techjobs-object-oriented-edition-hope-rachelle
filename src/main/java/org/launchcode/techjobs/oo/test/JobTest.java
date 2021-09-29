package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    //@Before
     //public void createNewJobs() {
        Job job1 = new Job();
        Job job2 = new Job();
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

    //}
    @Test
    public void testSettingJobId(){
      assertEquals(1, job2.getId() - job1.getId(), .001);
    }
    @Test
    public void testJobId(){
        assertNotEquals(0, job2.getId() - job1.getId(), .001);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(true, job3 instanceof Job);
    }

}
