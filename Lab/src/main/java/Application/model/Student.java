package Application.model;

public class Student extends Person implements Learner {
    String name;
    long id;
    double totalStudentTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void Leaner(double numberOfHours) {
        totalStudentTime+=numberOfHours;

    }

    public double getTotalStudentTime() {
        return totalStudentTime;
    }
}
