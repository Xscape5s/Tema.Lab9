package Abstraction;

public class SmartPhone extends Phone{


    @Override
    public void homeButton() {
        System.out.println("Home Page");
    }

    @Override
    public void volumeButton() {
        System.out.println("Volume up/down");
    }

    @Override
    public void chargeButton() {
        System.out.println("Phone charging.");
    }
}
