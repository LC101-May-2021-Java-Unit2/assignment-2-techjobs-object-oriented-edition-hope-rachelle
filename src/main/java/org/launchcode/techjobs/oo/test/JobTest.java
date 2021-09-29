package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

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
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
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
    @Test
    public void testJobConstructorSetsName(){
        assertEquals("Product tester", job3.getName());
    }
    @Test
    public void testJobConstructorSetsEmployer(){
        assertEquals("ACME", job3.getEmployer().getValue());
    }
    @Test
    public void testJobConstructorSetsLocation(){
        assertEquals("Desert", job3.getLocation().getValue());
    }
    @Test
    public void testJobConstructorSetsPosition(){
        assertTrue(String.valueOf(true), job3.getPositionType().getValue()=="Quality control");
    }
    @Test
    public void testJobConstructorSetsId(){
        assertTrue(String.valueOf(true), job3.getId()==3);
    }
    @Test
    public void testJobsIdsAreDifferent(){
        assertFalse(String.valueOf(false), job3.getId()==job4.getId());
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(String.valueOf(false), job3.equals(job4));
    }


}
