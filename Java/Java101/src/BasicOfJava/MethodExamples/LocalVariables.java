package BasicOfJava.MethodExamples;

public class LocalVariables {
    static void sum(int n1,int n2,int n3){
        n3=1;
        System.out.println(n3);
        int a = 25;
        System.out.println(a);
    }

    static void diff(){
        int a=15; // diff methoduna ait bir değişken
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        int b =10;

        sum(a,b,4);
        System.out.println(a);

        /*
        while (a<20){
            int b = 20;
        }
        System.out.println(b);

         */
        /*
        if(a<10){
            int b = 20;
        }
        System.out.println(b); // b nin var olup olmama durumu kesin olmadığı için hata verir

         */

    }
}
