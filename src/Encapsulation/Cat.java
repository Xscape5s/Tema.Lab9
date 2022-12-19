package Encapsulation;

public class Cat {

    private int mood;
    private int hungry;

    public int getMood() {
        return mood;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }

    private int energy;
    private void meow(){
        System.out.println("meow");
    }

    public void sleep(){
        energy++;
        hungry++;
    }
    public void play(){
        mood++;
        energy--;
        meow();
    }
    public void feed(){
        hungry--;
        mood++;
        meow();
    }




}
