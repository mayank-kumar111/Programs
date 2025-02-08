public class M14_abstractClass2 {
    public static void main(String[] args) {
        Horse myHorse = new Horse(); // Create a Horse object
        myHorse.animalSound();

    }

    static abstract class Animal {
        String color;

        Animal() {
            System.out.println("Animal is created");
        }

        // Abstract method (does not have a body)
        abstract void animalSound();

        // Regular method
        void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inheriting from Animal)
    static class Pig extends Animal {
        Pig() {
            System.out.println("Pig is created");
        }

        void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    // Subclass (inheriting from Animal)
    static class Horse extends Pig {
        Horse() {
            System.out.println("Horse is created");
        }

        void animalSound() {
            System.out.println("The horse says: neigh");
        }
    }

}