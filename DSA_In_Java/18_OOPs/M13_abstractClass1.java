public class M13_abstractClass1 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Horse myHorse = new Horse(); // Create a Horse object
        myHorse.animalSound();
        myHorse.sleep();
    }

    // Static nested abstract class
    static abstract class Animal {
        // Abstract method (does not have a body)
        abstract void animalSound();

        // Regular method
        void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inheriting from Animal)
    static class Pig extends Animal {
        void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    // Subclass (inheriting from Animal)
    static class Horse extends Animal {
        void animalSound() {
            System.out.println("The horse says: neigh");
        }
    }
}
