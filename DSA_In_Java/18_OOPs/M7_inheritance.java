public class M7_inheritance {
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }

    static class Vehicle {
        protected String brand = "Ford";        // Vehicle attribute
        public void honk() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }

    static class Car extends Vehicle {
        private String modelName = "Mustang";    // Car attribute
    }
    
}
