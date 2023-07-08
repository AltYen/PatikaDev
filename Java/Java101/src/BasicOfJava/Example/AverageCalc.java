package BasicOfJava.Example;
import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih=inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik=inp.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        String durum = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız : " + sonuc);
        System.out.println(durum);



    }
}
