package com.vivekjava;

public class MyAbstract implements Animal{
    public static void main(String[] args) {

    }

    @Override
    public void legs() {

    }

    @Override
    public void color() {

    }

    @Override
    public void isWild() {

    }
}

interface Animal{
    int eyes = 2;
    //it will be 100% abstract class
    //all the fields are public static final
    void legs();
    void color();
    void isWild();

}



abstract class CoffeMachine {

    CoffeMachine(){
        System.out.println("Coffee machine reboot");
    }

    static void addSugar(){
        System.out.println("Add coffee");
    };

    abstract void start();

    abstract void stop();

    public void blackCoffee() {
        System.out.println("making black coffee");
    }

    public void sugrFreeCoffee() {
        System.out.println("making sugar free coffee");
    }

}
