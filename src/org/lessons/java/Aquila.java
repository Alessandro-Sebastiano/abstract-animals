package org.lessons.java;

public class Aquila extends Animal implements Fly{
    @Override
    public void speak() {
        System.out.println("Klee-ee");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }

    @Override
    public void flying() {
        System.out.println("Sto volando!");
    }
}
