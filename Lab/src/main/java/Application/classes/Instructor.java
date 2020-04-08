package Application.classes;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.Leaner(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
   int size= 0;
 while (learners.iterator().next()!=null){
     size++;
 }
        double numberOfHoursPerLearner = numberOfHours / size;

        for (Learner l : learners){
        l.Leaner(numberOfHoursPerLearner);
    }

    }
}
