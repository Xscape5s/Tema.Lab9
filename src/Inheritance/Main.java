package Inheritance;

public class Main {

    public static void main(String[] args) {
        String[] classes={"Math","Language","History","Geography"};
        int[] grades ={5,7,7,9};
        String[] students={"Name","Name","Name","Name","Name","Name","Name","Name"};

        Person person= new Person("Name","Email");
        Person student= new Student(classes,grades,"Email","Name");
        Person teacher= new Teacher("Math");
        Person privateTeacher= new PrivateTeacher(students);
        Person publicTeacher= new PublicTeacher("School Name");

//        System.out.println(person);
//        System.out.println(student);
//        System.out.println(teacher);
//        System.out.println(privateTeacher);
//        System.out.println(publicTeacher);

    }
}
