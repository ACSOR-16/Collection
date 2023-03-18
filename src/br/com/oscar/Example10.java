package br.com.oscar;

import br.com.oscar.model.Course;

import java.util.*;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Course courseOne = new Course("Java",30);
        Course courseTwo = new Course("Python",40) ;
        Course courseThree = new Course("Go",60);
        Course courseFour = new Course("Javascript",50);
        Course courseFive = new Course("ruby",30);
        Course courseSix = new Course("Rust",40);
        Course courseSeven = new Course("Go", 30);
        Course courseEight = new Course("Kotlin",56);

        ArrayList<Course> coursesArray = new ArrayList<>();
        coursesArray.add(courseOne);
        coursesArray.add(courseTwo);
        coursesArray.add(courseThree);
        coursesArray.add(courseFour);
        coursesArray.add(courseFive);
        coursesArray.add(courseSix);
        coursesArray.add(courseSeven);
        coursesArray.add(courseEight);

        System.out.println(coursesArray);

        List<Course> coursesList = coursesArray.stream().filter(course -> !course.getName().equalsIgnoreCase("Go")).sorted(Comparator.comparingInt(Course::getTime)).collect(Collectors.toList());
        System.out.println(coursesList.stream().mapToDouble(Course::getTime).sum());

        System.out.println(coursesArray.stream().mapToDouble(Course::getTime).average().getAsDouble());
        System.out.println(coursesArray.stream().mapToInt(Course::getTime).max().getAsInt());
        System.out.println(coursesArray.stream().mapToInt(Course::getTime).min().getAsInt());

        Map<String, List<Course>> groupCourses = coursesArray.stream().collect(Collectors.groupingBy((Course::getName)));
        groupCourses.forEach((key, value) -> System.out.println(key + " - " + value.size()));

        System.out.println(coursesArray.parallelStream().mapToInt(Course::getTime).sum());
    }
}
