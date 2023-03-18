package br.com.oscar;

import br.com.oscar.model.Classroom;
import br.com.oscar.model.Course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example8 {
    public static final  List<List<Integer>> lists = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };
    public static void main(String[] args) {
        for (List<Integer> list : lists){
            final String implementationName = list.getClass().getSimpleName();

            //add
            long start =  System.currentTimeMillis();
            for (int index = 0; index < 100000; index++) {
                list.add(index);
            }
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println(implementationName + "add: " + duration);

            //get
            start = System.currentTimeMillis();
            for (int index = 0; index < 100000; index++) {
                list.get(index);
            }
            end = System.currentTimeMillis();
            duration = end - start;
            System.out.println(implementationName + "get: " + duration);

            //remove
            start = System.currentTimeMillis();
            for (int index = 9999; index >= 0; index--) {
                list.remove(index);
            }
            end = System.currentTimeMillis();
            duration = end - start;
            System.out.println(implementationName + "remove: " + duration);
        }
    }
}
