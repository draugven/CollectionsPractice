package Students;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elizaveta Naimark on 18.09.2016.
 */

public class Printer {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Christian Pink",1));
        students.add(new Student("Mary Jane",2));
        students.add(new Student("John Doe",2));
        students.add(new Student("Jane Doe",2));
        students.add(new Student("Rita Mint",3));
        students.add(new Student("George King",3));
        students.add(new Student("Jacob Bail",4));
        students.add(new Student("Philip Hart",4));
        printStudents(students, 4);
    }

    public static void printStudents(List<Student> students, int course){
        for(Student student : students){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}