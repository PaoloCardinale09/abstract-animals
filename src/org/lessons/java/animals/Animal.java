package org.lessons.java.animals;

public abstract class Animal {
    //FIELD (private)
    private String name;

    //CONSTRUCTOR
    public Animal(String name) {
        this.name = name;
    }


    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    //METHODS
    public void dormi() {
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void mangia();


}
