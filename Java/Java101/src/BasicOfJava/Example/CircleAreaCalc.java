package BasicOfJava.Example;
import java.util.Scanner;

public class CircleAreaCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r,alan,dilimAlan,cevre,pi=3.14,alpha;

        System.out.print("Dairenin yaricapi = ");
        r=inp.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı = " + alan);
        System.out.println("Dairenin Cevresi = " + cevre);

        System.out.print("Merkez açı = ");
        alpha=inp.nextDouble();

        dilimAlan=(pi*(r*r)*alpha) / 360;
        System.out.println("Daire diliminin alanı = " + dilimAlan);

    }
}
