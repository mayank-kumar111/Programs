// Purpose: To demonstrate the use of super keyword in java.

public class M18_super {
    public static void main(String[] args) {
        Dog d = new Dog();
        
    }

}

class Animal {
    String color;
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super.color = "black";
        System.out.println("dog is created");
    }
}
