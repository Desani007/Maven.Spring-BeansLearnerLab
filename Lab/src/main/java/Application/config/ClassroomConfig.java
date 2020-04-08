package Application.config;

import Application.classes.Classroom;
import Application.classes.Instructors;
import Application.classes.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
    public class ClassroomConfig {



        @Bean("currentCohort")
        @DependsOn({"instructors", "currentStudents"})
        public Classroom currentCohort(Instructors instructors, @Qualifier("currentStudents") Students students) {
            return new Classroom(instructors, students);
        }

        @Bean

        @DependsOn({"instructors", "previousStudents"})
        public Classroom previousCohort(Instructors instructors, @Qualifier("previousStudents") Students previousStudents) {
            return new Classroom(instructors, previousStudents);
        }



}
