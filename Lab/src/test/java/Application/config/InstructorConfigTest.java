package Application.config;

import Application.classes.Instructors;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {

    @Autowired
    @Qualifier("allInstructors")
    Instructors allInstructors;



    @Test
    public void instructorsTest() {
        Assert.assertEquals("Roberto", allInstructors.findById(2L).getName());
    }


}
