package br.com.oscar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Course courseOne = new Course("Math",30);
        Course courseTwo = new Course("Geometry",10) ;
        Course courseThree = new Course("Algebra",20);
        Course courseFour = new Course("Chemistry",50);

        ArrayList<Course> coursesArray = new ArrayList<>();
        coursesArray.add(courseOne);
        coursesArray.add(courseTwo);
        coursesArray.add(courseThree);
        coursesArray.add(courseFour);

        System.out.println(coursesArray);

    }
}
