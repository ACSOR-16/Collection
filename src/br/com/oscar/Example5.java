package br.com.oscar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        Course courseOne = new Course("Java",30);
        Course courseTwo = new Course("Python",40) ;
        Course courseThree = new Course("Go",20);
        Course courseFour = new Course("Javascript",50);

        ArrayList<Course> coursesArray = new ArrayList<>();
        coursesArray.add(courseOne);
        coursesArray.add(courseTwo);
        coursesArray.add(courseThree);
        coursesArray.add(courseFour);

        System.out.println(coursesArray);

//        Collections.sort(coursesArray, Collections.reverseOrder());
//        System.out.println(coursesArray);
//
//        // without using the Comparator in the class
//        Collections.sort(coursesArray, Comparator.comparing(Course::getName).reversed());
//        System.out.println(coursesArray);

//        List<Course> coursesList = coursesArray.stream().sorted(Comparator.comparingInt(Course::getTime)).collect(Collectors.toList());
        List<Course> coursesList = coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("Go")).sorted(Comparator.comparingInt(Course::getTime)).collect(Collectors.toList());
        System.out.println(coursesList);
    }
}
