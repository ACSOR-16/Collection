package br.com.oscar;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example12 {
    //TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    //TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {
        String studentOne = "Adhara Carpo";
        String studentTwo = "Oscar Aguirre";
        String studentThree = "Daniela Vilca";
        String studentFour = "Liz Fernandez";
        String studentFive = "Mileny Olivas";
        String studentSix = "Jhefferson Espinoza";
        String studentSeven = "Mileny Olivas";

        // there is no order, it does not allow equal data nad it lacks some methods
        // can also be declared from collection
//        Set<String> listStudents = new HashSet<>();
        Collection<String> listStudents = new HashSet<>();

        listStudents.add(studentOne);
        listStudents.add(studentTwo);
        listStudents.add(studentThree);
        listStudents.add(studentFour);
        listStudents.add(studentFive);
        listStudents.add(studentSix);
        listStudents.add(studentSeven);

        for (String student: listStudents) {
            System.out.println(student);
        }

    }
}
