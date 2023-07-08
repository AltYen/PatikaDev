package BasicOfJava.Example;
import java.util.Scanner;
public class TaximeterCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km;
        double kmTutar=2.20,ucret=10;

        System.out.print("Katedilen mesafe(km) = ");
        km=inp.nextInt();

        ucret = (km*kmTutar) + ucret; //ucret += (km*kmTutar)
        ucret = ucret < 20 ? 20 : ucret;
        System.out.println("Ucret = " + ucret);




    }
}
