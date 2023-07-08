package BasicOfJava.Example;
import java.util.Scanner;
public class kdvCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar,kdvTutar,kdvOran;

        System.out.print("Ücret Tutarı : ");
        tutar=inp.nextDouble();

        kdvOran = (tutar>=0 && tutar<=1000) ? 0.18 : 0.8;
        kdvTutar= tutar*kdvOran;

        System.out.println("KDV'siz Tutar = " + tutar);
        System.out.println("KDV Oranı = " + kdvOran);
        System.out.println("KDV Tutarı = " + kdvTutar);
        System.out.println("KDV'li Tutar = " + (tutar+kdvTutar));}
}
