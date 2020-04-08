package Application.config;

import Application.classes.Student;
import Application.classes.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


    @Configuration
    public class StudentConfig {

        @Bean(name = "currentStudents")
        public Students currentStudents() {
            List<Student> cohort2000 = new ArrayList<>();
            cohort2000.add(new Student(1L, "jimmy"));
            cohort2000.add(new Student(2L, "kasper"));
            cohort2000.add(new Student(3L, "Josh"));
            return new Students(cohort2000);
        }

        @Bean
        @Qualifier("previousStudents")
        public Students previousStudents() {
            List<Student> cohort20001 = new ArrayList<>();
            cohort20001.add(new Student(4L, "jogn"));
            cohort20001.add(new Student(5L, "cotton"));
            cohort20001.add(new Student(6L, "Jack"));
            return new Students(cohort20001);
        }


    }