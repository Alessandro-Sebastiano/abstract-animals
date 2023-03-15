package org.lessons.java;

public class Main {

    public static void main(String[] arg){

        Cane dog = new Cane();

        dog.speak();
        dog.eat();
        dog.sleep();

        System.out.println();

        Passerotto passerotto = new Passerotto();

        passerotto.speak();
        passerotto.eat();
        passerotto.sleep();

        System.out.println();

        Aquila eagle = new Aquila();

        eagle.speak();
        eagle.eat();
        eagle.sleep();

        System.out.println();

        Delfino dolphin = new Delfino();

        dolphin.speak();
        dolphin.eat();
        dolphin.sleep();
    }

}
