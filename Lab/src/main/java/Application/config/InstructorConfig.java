package Application.config;


import Application.classes.Instructor;
import Application.classes.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {

    @Bean
    public Instructors findAllInstructos(){

        List<Instructor> teachers = new ArrayList<>();
       teachers.add(new Instructor(1L, "Dolio"));
        teachers.add(new Instructor(2L, "Roberto"));
        return new Instructors(teachers);
    }
    @Bean
    @Primary
    public Instructors allInstructors(){
        ArrayList<Instructor>  allInstructors = new ArrayList<>();
        allInstructors.addAll(findAllInstructos().findAll());
        return new Instructors(allInstructors);

    }

}