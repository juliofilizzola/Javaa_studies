
public class Main {
    public static void main(String[] args) {

        // example from boxing
        int x = 20;

       Object obj = x;

       System.out.println("Obj boxing -> " + obj);
       System.out.println("var int -> " + x);


       // example from unboxing

        int y = (int) x;

        System.out.println("Unboxing exe -> "+ y);


        // Wrapper Classes


        int x2 = 20;

        Integer obj2 = x2;

        System.out.println("Obj boxing -> " + obj2);
        System.out.println("var int -> " + x2);

        int y2 = obj2 * 2;

        System.out.println("count -> " + y2);
    }
}