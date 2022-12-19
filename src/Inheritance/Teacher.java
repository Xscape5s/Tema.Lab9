package Inheritance;

public class Teacher extends Person {

    private String subject;

    Teacher(String subject){
        this.subject=subject;
        {System.out.println(toString());}
    }

    Teacher(){}

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }


}
