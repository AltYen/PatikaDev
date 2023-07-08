package BasicOfJava.Example;
import java.util.Scanner;
public class TriangularAreaCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a,b,c;
        double alan,u ;

        System.out.print("A Kenarı : ");
        a=inp.nextDouble();
        System.out.print("B Kenarı : ");
        b=inp.nextDouble();
        System.out.print("C Kenarı : ");
        c=inp.nextDouble();

        u=(a+b+c)/2;
        alan=Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Kenarları girilen üçgenin alanı = " + alan);
    }
}
