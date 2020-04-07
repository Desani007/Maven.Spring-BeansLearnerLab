package Application.model;

public class Classroom {
    Instructor instructorList;
    Students studentList;
    Instructors instructors;
    Students students;

    public Classroom(Instructor instructorList, Students studentList) {
        this.instructorList = instructorList;
        this.studentList = studentList;
    }
    public Classroom(Instructors instructors, Students students) {
            this.instructors = instructors;
            this.students = students;
        }

        public void hostLecture(Teacher teacher, double numberOfHours){
            teacher.lecture(studentList, numberOfHours);
            teacher.lecture(students, numberOfHours);
        }

        public Instructors getInstructors() {
            return instructors;
        }


        public Students getStudents() {
            return students;
        }

        public void setStudents(Students students) {
            this.students = students;
        }
    }