public class M4_constructors {
    public static void main(String[] args) {
        // Constructors are special methods that are called when an object is
        // instantiated.
        // Constructors have the same name as the class and do not have a return type.
        // Constructors can be overloaded.
        // Constructors can be used to initialize the object's state.

        // Default constructor
        // If a class does not have any constructor, then Java provides a default
        // constructor.
        // The default constructor is a no-argument constructor.
        // The default constructor initializes the object with default values.
        // The default values are 0 for numeric types, false for boolean, and null for
        // reference types.
        // The default constructor is provided by Java only if there is no constructor
        // in the class.
        // If a class has a constructor, then Java does not provide a default
        // constructor.
        // If a class has a constructor, then the class must have a no-argument
        // constructor if we want to create an object without passing any arguments.

        // No-argument constructor
        Employee emp1 = new Employee();
        System.out.println("Employee ID: " + emp1.id);

        // Parameterized constructor
        Employee emp2 = new Employee(101, "Mayank");
        System.out.println("Employee ID: " + emp2.id + ", Employee Name: " + emp2.name);

        // Constructor overloading
        // Constructor overloading is a concept where a class can have more than one
        // constructor with different parameters.
        // The constructors must have different parameters to be overloaded.
        // The constructors can have different numbers of parameters or different types
        // of parameters.
        // The constructors can have different order of parameters.
        // The constructors can have different access modifiers.
        // The constructors can have different return types.
        // The constructors can have different exceptions.
        // The constructors can have different access specifiers.
        // The constructors can have different modifiers.
        // The constructors can have different names.
        // The constructors can have different return types.
        // The constructors can have different exceptions.

        // Constructor overloading
        Employee emp3 = new Employee();
        Employee emp4 = new Employee(102, "Ankit");
        Employee emp5 = new Employee(103, "Rahul");
        System.out.println("Employee ID: " + emp3.id + ", Employee Name: " + emp3.name);
        System.out.println("Employee ID: " + emp4.id + ", Employee Name: " + emp4.name);
        System.out.println("Employee ID: " + emp5.id + ", Employee Name: " + emp5.name);

        // Constructor chaining
        // Constructor chaining is a concept where one constructor calls another
        // constructor of the same class.
        // Constructor chaining is achieved using this() keyword.
        // The this() keyword is used to call another constructor of the same class.
        // The this() keyword must be the first statement in the constructor.
        // The this() keyword can be used to call another constructor with parameters.

        // Constructor chaining
        Employee emp6 = new Employee(104, "Rohit");
        System.out.println("Employee ID: " + emp6.id + ", Employee Name: " + emp6.name);

        Employee emp7 = new Employee("Rohit", 105);
        System.out.println("Employee ID: " + emp7.id + ", Employee Name: " + emp7.name);

        Employee emp8 = new Employee(106);
        System.out.println("Employee ID: " + emp8.id);

        Employee emp9 = new Employee("Rohit");
        System.out.println("Employee Name: " + emp9.name);

        Employee emp10 = new Employee(107, "Rohit", "Delhi");
        System.out.println("Employee ID: " + emp10.id + ", Employee Name: " + emp10.name);

        Employee emp11 = new Employee("Rohit", 108, "Delhi");
        System.out.println("Employee ID: " + emp11.id + ", Employee Name: " + emp11.name);

        // Constructor chaining with super()
        // Constructor chaining with super() is a concept where one constructor calls
        // another constructor of the parent class.
        // Constructor chaining with super() is achieved using super() keyword.
        // The super() keyword is used to call another constructor of the parent class.
        // The super() keyword must be the first statement in the constructor.
        // The super() keyword can be used to call another constructor with parameters.

        // Constructor chaining with super()
        Employee emp12 = new Employee(109, "Rohit", "Delhi");
        System.out.println("Employee ID: " + emp12.id + ", Employee Name: " + emp12.name);

        Employee emp13 = new Employee("Rohit", 110, "Delhi");
        System.out.println("Employee ID: " + emp13.id + ", Employee Name: " + emp13.name);

        // Constructor chaining with this() and super()
        // Constructor chaining with this() and super() is a concept where one
        // constructor calls another constructor of the same class or the parent class.
        // Constructor chaining with this() and super() is achieved using this() and
        // super() keywords.
        // The this() keyword is used to call another constructor of the same class.
        // The super() keyword is used to call another constructor of the parent class.
        // The this() and super() keywords must be the first statement in the
        // constructor.
        // The this() and super() keywords can be used to call another constructor with
        // parameters.

        // Constructor chaining with this() and super()
        Employee emp14 = new Employee(111, "Rohit", "Delhi");
        System.out.println("Employee ID: " + emp14.id + ", Employee Name: " + emp14.name);

        Employee emp15 = new Employee("Rohit", 112, "Delhi");
        System.out.println("Employee ID: " + emp15.id + ", Employee Name: " + emp15.name);

    }
}

class Employee {
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

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
    }

    public Employee(String name, int id, String address) {
        this.id = id;
        this.name = name;
    }
}
