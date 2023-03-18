package br.com.oscar;

import br.com.oscar.model.Student;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Example14 {
      public static void main(String[] args) {
        Student alumno1 = new Student("Luis Miguel","001");
        Student alumno2 = new Student("Pepito los palotes","002");
        Student alumno3 = new Student("Juan Carlos","0003");
        Student alumno4 = new Student("Pedro Pedrito","004");
        Student alumno5 = new Student("Gustavo sanchez","005");
        Student alumno6 = new Student("Marcia Maria","006");
        Student alumno7 = new Student("Marcia Maria","007");
        Student alumno8 = new Student("Gustavo Sanchez","008");

        Collection<Student> listaAlumnos = new HashSet<>();;

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        Student nuevoAlumno = new Student("Luis Miguel","001");

        System.out.println(alumno1.equals(nuevoAlumno));
        System.out.println(listaAlumnos.contains(nuevoAlumno));

    }
}
