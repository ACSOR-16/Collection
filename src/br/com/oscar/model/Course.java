package br.com.oscar.model;

import java.util.*;

public class Course implements Comparable<Course>{
    private  String name;
    private int time;
    private List<Classroom> classroomList = new ArrayList<>();
    private Collection<Student> students = new HashSet<>();
//    private Collection<Student> students = new LinkedHashSet<>();

    public Course(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Course(String name, int time, List<Classroom> classroomList) {
        this.name = name;
        this.time = time;
        this.classroomList = classroomList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Classroom> getClassroomList() {
//        return classroomList;
        return Collections.unmodifiableList(classroomList); // no se puede modificar
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public void addClassroom(Classroom clas) {
        this.classroomList.add(clas);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public boolean checkStudent(Student student) {
        return this.students.contains(student);
    }

    public Collection<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Course o) {
        return this.name.compareTo(o.getName());
    }
}
