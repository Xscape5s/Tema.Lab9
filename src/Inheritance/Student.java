package Inheritance;

import java.util.Arrays;

public class Student extends Person{

    Person person =new Person();

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    private String[] classes;
    private int[] grades;

    Student(String[] classes,int[] grades,String email,String name){
        this.classes=classes;
        this.grades=grades;
        this.person.setEmail(email);
        this.person.setName(name);
        {System.out.println(toString());}
    }

    @Override
    public String toString() {
        return "Student{" + person +
                ", classes=" + Arrays.toString(classes) +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
