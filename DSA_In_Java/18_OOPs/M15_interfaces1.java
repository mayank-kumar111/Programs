public class M15_interfaces1 {
    public static void main(String[] args) {
        pawn p = new pawn();
        rook r = new rook();
        knight k = new knight();
        p.move();
        r.move();
        k.move();
        
    }

    interface chess{
        void move();
    }

    static class pawn implements chess{
        public void move(){
            System.out.println("Pawn moves forward");
        }
    }

    static class rook implements chess{
        public void move(){
            System.out.println("Rook moves straight");
        }
    }

    static class knight implements chess{
        public void move(){
            System.out.println("Knight moves in L shape");
        }
    }
}
