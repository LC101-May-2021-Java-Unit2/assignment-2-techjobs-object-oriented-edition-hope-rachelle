package org.launchcode.techjobs.oo.tests;

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
    /*Job job1;
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
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency(""));

    }*/
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName().toString());
        assertEquals("ACME", job.getEmployer().toString());
        assertEquals("Desert", job.getLocation().toString());
        assertEquals("Quality control", job.getPositionType().toString());
        assertEquals("Persistence", job.getCoreCompetency().toString());
        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false, job3.equals(job4));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(String.valueOf(true), job3.toString().startsWith("\n"));
        assertTrue(String.valueOf(true), job3.toString().endsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + job3.getId() +
                "\nName: " + job3.getName() +
                "\nEmployer: " + job3.getEmployer().getValue() +
                "\nLocation: " + job3.getLocation().getValue() +
                "\nPosition Type: " + job3.getPositionType().getValue() +
                "\nCore Competency: " + job3.getCoreCompetency().getValue() + "\n";
        assertEquals(expected, job3.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency(""));

        String expected = "\nID: " + job5.getId() + "\n" +
                "Name: " + job5.getName() + "\n" +
                "Employer: " + job5.getEmployer() + "\n" +
                "Location: " + job5.getLocation() + "\n" +
                "Position Type: " + job5.getPositionType()+ "\n" +
                "Core Competency: Data not available" + "\n";
        assertEquals(expected, job5.toString());
    }


}
