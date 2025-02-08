public class M9_hierarchialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }

    static class Animal {
        void eat() {
            System.out.println("eating...");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("barking...");
        }
    }

    static class Cat extends Animal {
        void meow() {
            System.out.println("meowing...");
        }
    }

}
