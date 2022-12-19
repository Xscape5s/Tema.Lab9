package Inheritance;

public class PublicTeacher extends Teacher{

    private String school;

    PublicTeacher(String school){
        this.school=school;
        {System.out.println(toString());}
    }

    @Override
    public String toString() {
        return "PublicTeacher{" +
                "school='" + school + '\'' +
                '}';
    }


}
