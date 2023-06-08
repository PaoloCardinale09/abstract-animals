package org.lessons.java.animals;

public class Delfino extends Animal implements HasFly {
    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Vocalizzi");

    }

    @Override
    public void mangia() {
        System.out.println("Pesci");
    }

    @Override
    public void vola() {
        System.out.println("Sto nuotando!!!");
    }
}
