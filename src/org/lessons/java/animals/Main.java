package org.lessons.java.animals;

public class Main {
    public static void makeSwim(HasSwim animal) {
        animal.nuota();
    }

    public static void makeFly(HasFly animal) {
        animal.vola();
    }

    public static void main(String[] args) {
        Animal[] farm = new Animal[4];
        farm[0] = new Aquila("Olimpia");
        farm[1] = new Cane("Boris");
        farm[2] = new Passerotto("Cip");
        farm[3] = new Delfino("Flipper");

        for (Animal a : farm) {
            System.out.println(a.getClass().getSimpleName() + " " + a.getName());
            a.dormi();
            a.mangia();
            a.verso();
            if (a instanceof HasSwim) {
                makeSwim((HasSwim) a);
            }
            if (a instanceof HasFly) {
                makeFly((HasFly) a);
            }
            System.out.println("\n");

        }


    }

}
