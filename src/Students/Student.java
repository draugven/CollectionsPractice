package Students;

/**
 * Created by Elizaveta Naimark on 18.09.2016.
 */
public class Student{
    private final String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
