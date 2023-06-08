package org.lessons.java.animals;

public class Aquila extends Animal implements HasFly {
    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Screech");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
