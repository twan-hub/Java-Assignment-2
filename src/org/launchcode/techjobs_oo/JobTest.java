package org.launchcode.techjobs_oo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class JobTest {

//    @BeforeEach
//    void setUp() {
//        Job job1 = new Job();
//        Job job2 = new Job();
//    }

    @Test
    void getId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
    }
    @Test
    void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertFalse(job.getName().isEmpty());
        assertTrue(job.getId() != 0);
        System.out.println(job.toString());
    }
    @Test
    void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job2));
        System.out.println(job.toString());
        System.out.println(job2.toString());
    }
    @Test
    void testToString(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toSome=job.toString();
        assertEquals(toSome,job.toString());
        System.out.println(job.toString());
    }
    @Test
    void testEmptyString(){
        Job job = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));
        String toSome=job.toString();
        assertEquals(toSome,job.toString());
        System.out.println(job.toString());
    }
}