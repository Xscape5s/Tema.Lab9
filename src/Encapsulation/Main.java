package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.feed();
        cat.play();
        cat.sleep();
        System.out.println("Cat mood: "+cat.getMood()+"\nCat hungry: "+cat.getHungry()+
                "\nCat energy: "+cat.getEnergy());
    }
}
