package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;
public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void emptyTest(){
        Assert.assertEquals(true, true);
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



}

