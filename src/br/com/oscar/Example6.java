package br.com.oscar;

import br.com.oscar.model.Classroom;
import br.com.oscar.model.Course;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {
        Course courseOne = new Course("Java", 30);
        courseOne.addClassroom(new Classroom("ArrayList"));
        courseOne.addClassroom(new Classroom("List"));
        courseOne.addClassroom(new Classroom("LinkedList"));

        ArrayList<Course> coursesArray = new ArrayList<>();
        coursesArray.add(courseOne);

        System.out.println(coursesArray.get(0).getClassroomList());
    }
}
