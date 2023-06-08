package org.lessons.java.animals;

public class Cane extends Animal implements HasSwim {
    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Bau bau");

    }

    @Override
    public void mangia() {
        System.out.println("Crocchette");

    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
