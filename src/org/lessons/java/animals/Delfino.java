package org.lessons.java.animals;

public class Delfino extends Animal implements HasSwim {
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
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
