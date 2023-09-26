package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;
public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void emptyTest(){
        Assert.assertEquals(true,  true);
    }
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        String msg = " IDs of the two job get id objects are distinct";
        Assert.assertNotEquals(job1.getId(),job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job =new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue("productTester should be an instance of Job",job instanceof Job);
        Assert.assertEquals("Name should be 'Product tester'","Product tester", job.getName());
        Assert.assertEquals("Employer should have value 'ACME'","ACME", job.getEmployer().getValue());
        Assert.assertEquals("Location should have value 'Desert'","Desert", job.getLocation().getValue());
        Assert.assertEquals("Position Type should have value 'Quality control'","Quality control", job.getPositionType().getValue());
        Assert.assertEquals("Core Competency should have value 'Persistence'","Persistence", job.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String msg ="Check two objects are NOT equal with different id's";
        Assert.assertFalse(msg,job1.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        Assert.assertTrue(job1.toString().startsWith(newline));
        Assert.assertTrue(job1.toString().endsWith(newline));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String expected = newline +
                "ID: " + job1.getId() + newline +
                "Name: " + "Product tester" + newline +
                "Employer: " + "ACME" + newline +
                "Location: " + "Desert" + newline +
                "Position Type: " + "Quality control" + newline +
                "Core Competency: " + "Persistence" + newline;
        Assert.assertEquals(expected,job1.toString());
    }

    // Custom toString, equals, and hashCode methods:
    @Test
    public void testToStringHandlesEmptyField(){
        Job job1 = new Job("Test", new Employer(""),
                new Location(""), new PositionType(""), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator()+
                "ID: " + job1.getId() + System.lineSeparator() +
                "Name: " + "Test" + System.lineSeparator() +
                "Employer: " + "Data not available" + System.lineSeparator() +
                "Location: " + "Data not available" + System.lineSeparator() +
                "Position Type: " + "Data not available" + System.lineSeparator() +
                "Core Competency: " + "Persistence" +
                System.lineSeparator();
        Assert.assertEquals(expected,job1.toString());
    }

}

