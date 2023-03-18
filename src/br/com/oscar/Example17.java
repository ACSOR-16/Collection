package br.com.oscar;

import br.com.oscar.model.Course;
import br.com.oscar.model.Student;

import java.util.Iterator;

public class Example17 {
      public static void main(String[] args) {

          Course courseOne = new Course("Math", 50);

          Student alumno1 = new Student("Luis Miguel","001");
          Student alumno2 = new Student("Pepito los palotes","002");
          Student alumno3 = new Student("Juan Carlos","0003");
          Student alumno4 = new Student("Pedro Pedrito","004");
          Student alumno5 = new Student("Gustavo sanchez","005");
          Student alumno6 = new Student("Marcia Maria","006");
          Student alumno7 = new Student("Marcia Maria","007");
          Student alumno8 = new Student("Gustavo Sanchez","008");

          courseOne.addStudent(alumno1);
          courseOne.addStudent(alumno2);
          courseOne.addStudent(alumno3);
          courseOne.addStudent(alumno4);
          courseOne.addStudent(alumno5);
          courseOne.addStudent(alumno6);
          courseOne.addStudent(alumno7);
          courseOne.addStudent(alumno8);

//          courseOne.getStudents().forEach(student -> System.out.println(student));

          Iterator<Student> studentIterator = courseOne.getStudents().iterator();
          while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
          }
          studentIterator.next();// exception noSuchElementException
      }
}
