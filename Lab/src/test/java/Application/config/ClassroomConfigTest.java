package Application.config;

import Application.classes.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;




    @Test
    public void currentCohortTest() {
        Assert.assertEquals("Roberto", currentCohort.getInstructors().findById(2L).getName());
    }

    @Test
    public void previousCohortTest() {
        Assert.assertEquals("Dolio", previousCohort.getInstructors().findById(1L).getName());
    }
}
