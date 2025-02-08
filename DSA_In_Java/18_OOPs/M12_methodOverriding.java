public class M12_methodOverriding {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.display();
        obj.print();
    }

    static class A {
        void show() {
            System.out.println("A");
        }

        void display() {
            System.out.println("A");
        }

        void print() {
            System.out.println("A");
        }
    }

    static class B extends A {
        void show() {
            System.out.println("B");
        }

        void display() {
            System.out.println("B");
        }

        void print() {
            System.out.println("B");
        }
    }
}
