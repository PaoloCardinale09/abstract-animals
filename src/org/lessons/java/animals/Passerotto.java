package org.lessons.java.animals;

public class Passerotto extends Animal implements HasFly {
    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Cip cip");

    }

    @Override
    public void mangia() {
        System.out.println("Vermi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
