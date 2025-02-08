public class M1_classObject {
    public static void main(String[] args) {
        // Creating object of class
        M1_classObject obj = new M1_classObject();
        System.out.println(obj);
        // Creating object of class Pen
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.color = "Red";
        p1.setTipSize(5);
        System.out.println(p1.color);
        System.out.println(p1.tipSize);
        // Creating object of class Student
        Student student = new Student();
        student.setName("John");
        student.setRollNo(101);
        System.out.println(student.name);
        System.out.println(student.rollNo);
    }
}

class Pen {
    String color;
    int tipSize;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTipSize(int newtipSize) {
        this.tipSize = newtipSize;
    }
}

class Student {
    String name;
    int rollNo;

    void setName(String newName) {
        name = newName;
    }

    void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }
}
