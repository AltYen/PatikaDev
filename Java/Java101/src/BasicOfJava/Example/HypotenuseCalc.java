package BasicOfJava.Example;
import java.util.Scanner;
public class HypotenuseCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int aKenar,bKenar;
        double hipotenus;

        System.out.print("A Kenarı : ");
        aKenar=inp.nextInt();
        System.out.print("B Kenarı : ");
        bKenar=inp.nextInt();

        hipotenus=Math.sqrt((aKenar*aKenar)+(bKenar*bKenar));
        System.out.println("Hipotenüs = " + hipotenus);
    }
}
