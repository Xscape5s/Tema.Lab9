package Inheritance;

import java.util.Arrays;

public class PrivateTeacher extends Teacher{

    private String[] students;

    PrivateTeacher(String[] students){
        this.students=students;
        {System.out.println(toString());}
    }

    @Override
    public String toString() {
        return "PrivateTeacher{" +
                "students=" + Arrays.toString(students) +
                '}';
    }


}
