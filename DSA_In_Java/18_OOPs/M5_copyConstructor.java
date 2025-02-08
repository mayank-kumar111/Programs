// public class M5_copyConstructor {
//     static class Employee {
//         int id;
//         String name;

//         // No-argument constructor
//         public Employee() {
//             id = 0;
//             name = null;
//         }

//         // Parameterized constructor
//         public Employee(int id, String name) {
//             this.id = id;
//             this.name = name;
//         }

//         // Copy constructor
//         public Employee(Employee emp) {
//             id = emp.id;
//             name = emp.name;
//         }
//     }
//     public static void main(String[] args) {
//         // Copy constructor
//         Employee emp16 = new Employee(111, "Rohit");
//         Employee emp17 = new Employee(emp16);
//         System.out.println("Employee ID: " + emp17.id + ", Employee Name: " + emp17.name);
//     }
// }

public class M5_copyConstructor {
    static class Employee {
        int id;
        String name;

        // No-argument constructor
        public Employee() {
            id = 0;
            name = null;
        }

        // Parameterized constructor
        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Copy constructor
        public Employee(Employee emp) {
            this.id = emp.id;
            this.name = emp.name;
        }
    }

    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Employee emp16 = new Employee(111, "Rohit");

        // Creating a new Employee object using the copy constructor
        Employee emp17 = new Employee(emp16);

        // Printing the details of the copied Employee object
        System.out.println("Employee ID: " + emp17.id + ", Employee Name: " + emp17.name);
    }
}
