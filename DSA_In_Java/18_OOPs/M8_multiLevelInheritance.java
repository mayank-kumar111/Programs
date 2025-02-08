public class M8_multiLevelInheritance {
    public static void main(String[] args) {

        dog myDog = new dog();
        myDog.bark();
        myDog.feedYoung();
        myDog.move();
        myDog.run();
        myDog.sleep();
        myDog.wagTail();
        myDog.fetch();
        myDog.giveBirth();
        myDog.eat();

        cat myCat = new cat();
        myCat.meow();
        myCat.feedYoung();
        myCat.move();
        myCat.sleep();
        myCat.purr();
        myCat.scratch();
        myCat.giveBirth();
        myCat.eat();
    }

    static class animal {
        String color = "white";

        void eat() {
            System.out.println("eating...");
        }

        void sleep() {
            System.out.println("sleeping...");
        }

        void move() {
            System.out.println("moving...");
        }
    }

    static class mammal extends animal {
        void giveBirth() {
            System.out.println("giving birth...");
        }

        void feedYoung() {
            System.out.println("feeding young...");
        }

        void run() {
            System.out.println("running...");
        }
    }

    static class dog extends mammal {
        void bark() {
            System.out.println("barking...");
        }

        void wagTail() {
            System.out.println("wagging tail...");
        }

        void fetch() {
            System.out.println("fetching...");
        }
    }

    static class cat extends mammal {
        void meow() {
            System.out.println("meowing...");
        }

        void purr() {
            System.out.println("purring...");
        }

        void scratch() {
            System.out.println("scratching...");
        }
    }
}
