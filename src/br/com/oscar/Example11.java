package br.com.oscar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example11 {
    //TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    //TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {
        String studentOne = "Adhara Carpo";
        String studentTwo = "Oscar Aguirre";
        String studentThree = "Daniela Vilca";
        String studentFour = "Liz Fernandez";
        String studentFive = "Mileny Olivas";
        String studentSix = "Jhefferson Espinoza";

        Set<String> listStudents = new HashSet<>();

        listStudents.add(studentOne);
        listStudents.add(studentTwo);
        listStudents.add(studentThree);
        listStudents.add(studentFour);
        listStudents.add(studentFive);
        listStudents.add(studentSix);

        for (String student: listStudents) {
            System.out.println(student);
        }

    }
}
