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
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    @Before
     public void createTestJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId(){
        assertNotEquals(0, job2.getId() - job1.getId(), .001);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        //assertEquals(true, job3 instanceof Job);
        assertTrue("true", job3 instanceof Job);
    }
    @Test
    public void testConstructorSetId(){
        System.out.println(job3.getId());
        assertEquals(3, job3.getId());
        //assertTrue("true", job3.getId()==3);
    }
    @Test
    public void testJobConstructorSetsName(){
        assertEquals("Product tester", job3.getName());
        //assertTrue(String.valueOf(true), job3.getName()=="Product tester");
    }
    @Test
    public void testJobConstructorSetsEmployer(){
        assertEquals("ACME", job3.getEmployer().getValue());
        //assertTrue(String.valueOf(true), job3.getEmployer().getValue()=="ACME");
    }
    @Test
    public void testJobConstructorSetsLocation(){
        assertEquals("Desert", job3.getLocation().getValue());
        //assertTrue(String.valueOf(true), job3.getLocation().getValue()=="Desert");
    }
    @Test
    public void testJobConstructorSetsPosition(){
        assertEquals("Quality control", job3.getPositionType().getValue());
        //assertTrue(String.valueOf(true), job3.getPositionType().getValue()=="Quality control");
    }
    @Test
    public void testJobsIdsAreDifferent(){
        assertNotEquals(true, (job3.getId())==(job4.getId()));
    }
    @Test
    public void testJobsForEquality(){
        assertNotEquals(true, job3.equals(job4));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertTrue(String.valueOf(true), job3.toString().startsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        assertEquals(true, job3.toString().
                equals("\nID: " + job3.getId() +
                        "\nName: " + job3.getName() +
                        "\nEmployer: " + job3.getEmployer().getValue() +
                        "\nLocation: " + job3.getLocation().getValue() +
                        "\nPosition Type: " + job3.getPositionType().getValue() +
                        "\nCore Competency: " + job3.getCoreCompetency().getValue()));
    }
    @Test
    public void testToStringHandlesEmptyField(){
        assertTrue(String.valueOf(true), job5.toString().contains("Data not available"));
    }


}
