package Generic.BoundedTypes;

public class Main {
    public static void main(String[] args) {
        //Integer,Double,Float extends Number

        /* // bu blok çalışmazz
        String str = "abc";
        Nullable<String> n1 = new Nullable<>(str);
        n1.run();
         */

        /*
        Nullable<Integer> n1 = new Nullable<>(12);
        n1.run();
         */

        A aObj = null;
        Nullable<A> n = new Nullable<>(aObj);
        n.run();


    }
}
