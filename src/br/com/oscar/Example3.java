package br.com.oscar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String courseOne = "Math";
        String courseTwo = "Geometry";
        String courseThree = "Algebra";
        String courseFour = "Chemistry";

        ArrayList<String> coursesArray = new ArrayList<>();
        coursesArray.add(courseOne);
        coursesArray.add(courseTwo);
        coursesArray.add(courseThree);
        coursesArray.add(courseFour);

        System.out.println(coursesArray);

//        Collections.sort(coursesArray);
//        System.out.println(coursesArray);
//
//        Collections.sort(coursesArray, Collections.reverseOrder());
//        System.out.println(coursesArray);

//        coursesArray.sort(Comparator.naturalOrder());
//        System.out.println(coursesArray);

        List<String> coursesRefactor =  coursesArray.stream().sorted().collect(Collectors.toList());
        System.out.println(coursesRefactor);
    }
}
