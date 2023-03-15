package org.lessons.java;

public class Delfino extends Animal implements Swim{
    @Override
    public void speak() {
        System.out.println("wee-ee");
    }

    @Override
    public void eat() {
        System.out.println("Pesci");
    }

    @Override
    public void swimming() {
        System.out.println("Sto nuotando!");
    }
}
