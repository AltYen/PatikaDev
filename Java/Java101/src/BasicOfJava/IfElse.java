package BasicOfJava;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        /*
        int a = 20, b=20;
        boolean compare = a==b;

        String str = compare ? "Eşittir" : "Eşit Değildir";
        System.out.println(str);

        if(compare){
            a=50;
            System.out.println("A sayısı : " + a);
            System.out.println("Eşittir");
        }else{
            System.out.println("Eşit Değildir");
        }

        System.out.println("Program Bitti!");

         */

        int a=10, b=20, c=12;

        if(a<b){
            if(a<c){
                if(a==10){
                    System.out.println("A sayısı 10dur");
                }
                System.out.println("a en küçüktür");
            }else{
                System.out.println("a sayısı cden büyüktür");
            }
        }

        if(a<b && a<c){
            System.out.println("A en küçük sayı");
        }else if(b<a && b<c){
            System.out.println("B en küçük sayı");
        }else if(c<a && c<b){ // sadece else desekte olur gibi
            System.out.println("C en küçük sayı");
        }
    }
}
