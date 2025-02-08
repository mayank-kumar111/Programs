public class M16_interfaces2 {
    public static void main(String[] args) {
        lion l = new lion();
        deer d = new deer();
        omnivore o = new omnivore();
        human h = new human();
        l.eat();
        d.eat();
        o.eat();
        h.eat();
        h.eat("pizza");
        h.eat("pizza", 2);
    }

    interface carnivore{
        void eat();
    }

    interface herbivore{
        void eat();
    }

    static class lion implements carnivore{
        public void eat(){
            System.out.println("Lion eats meat");
        }
    }

    static class deer implements herbivore{
        public void eat(){
            System.out.println("Deer eats grass");
        }
    }

    // This will give an error as the method eat() is ambiguous
    // static class omnivore implements carnivore, herbivore{
    //     public void eat(){
    //         System.out.println("Omnivore eats both meat and grass");
    //     }
    // }

    // This will work as the method eat() is overridden
    static class omnivore implements carnivore, herbivore{
        public void eat(){
            System.out.println("Omnivore eats both meat and grass");
        }
    }

    static class human implements carnivore, herbivore{
        public void eat(){
            System.out.println("Human eats both meat and grass");
        }

        public void eat(String food){
            System.out.println("Human eats " + food);
        }

        public void eat(String food, int quantity){
            System.out.println("Human eats " + quantity + " " + food);
        }
    }
}
