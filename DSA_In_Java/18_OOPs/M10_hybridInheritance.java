public class M10_hybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.walk();
        dog.run();
        dog.wagTail();
        dog.fetch();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        cat.scratch();
        cat.climb();
        human human = new human();
        human.eat();
        human.speak();
        human.walk();
        human.run();
        human.talk();
        human.write();
        human.read();
        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.fly();
        parrot.makeNoise();
        parrot.mimic();
        parrot.talk();
        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.fly();
        penguin.makeNoise();
        penguin.swim();
        penguin.slide();
        Shark shark = new Shark();
        shark.eat();
        shark.swim();
        shark.makeNoise();
        shark.attack();
        shark.bite();
        Goldfish goldfish = new Goldfish();
        goldfish.eat();
        goldfish.swim();
        goldfish.makeNoise();
        goldfish.play();
        goldfish.jump();
    }

    static class Animal {
        void eat() {
            System.out.println("eating...");
        }

        void sleep() {
            System.out.println("sleeping...");
        }

        void roam() {
            System.out.println("roaming...");
        }

        void makeNoise() {
            System.out.println("making noise...");
        }
    }

    static class fish extends Animal {
        void swim() {
            System.out.println("swimming...");
        }
    }

    static class bird extends Animal {
        void fly() {
            System.out.println("flying...");
        }
    }

    static class mammal extends Animal {
        void speak() {
            System.out.println("speaking...");
        }

        void walk() {
            System.out.println("walking...");
        }

        void run() {
            System.out.println("running...");
        }
    }

    static class Dog extends mammal {
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

    static class Cat extends mammal {
        void meow() {
            System.out.println("meowing...");
        }

        void scratch() {
            System.out.println("scratching...");
        }

        void climb() {
            System.out.println("climbing...");
        }
    }

    static class human extends mammal {
        void talk() {
            System.out.println("talking...");
        }

        void write() {
            System.out.println("writing...");
        }

        void read() {
            System.out.println("reading...");
        }
    }

    static class Parrot extends bird {
        void mimic() {
            System.out.println("mimicking...");
        }

        void talk() {
            System.out.println("talking...");
        }
    }

    static class Penguin extends bird {
        void swim() {
            System.out.println("swimming...");
        }

        void slide() {
            System.out.println("sliding...");
        }
    }

    static class Shark extends fish {
        void attack() {
            System.out.println("attacking...");
        }

        void bite() {
            System.out.println("biting...");
        }
    }

    static class Goldfish extends fish {
        void play() {
            System.out.println("playing...");
        }

        void jump() {
            System.out.println("jumping...");
        }
    }

}
