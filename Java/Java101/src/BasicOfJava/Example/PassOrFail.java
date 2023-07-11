package BasicOfJava.Example;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik,gecerliNot=0,toplamPuan=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=inp.nextInt();
        if(mat>=0 && mat<=100){
            gecerliNot++;
            toplamPuan+=mat;
        }

        System.out.print("Fizik notunuz : ");
        fizik=inp.nextInt();
        if(fizik>=0 && fizik<=100){
            gecerliNot++;
            toplamPuan+=fizik;
        }

        System.out.print("Turkce notunuz : ");
        turkce=inp.nextInt();
        if(turkce>=0 && turkce<=100){
            gecerliNot++;
            toplamPuan+=turkce;
        }

        System.out.print("Kimya notunuz : ");
        kimya=inp.nextInt();
        if(kimya>=0 && kimya<=100){
            gecerliNot++;
            toplamPuan+=kimya;
        }

        System.out.print("Muzik notunuz : ");
        muzik=inp.nextInt();
        if(muzik>=0 && muzik<=100){
            gecerliNot++;
            toplamPuan+=muzik;
        }

        double average = toplamPuan/gecerliNot;

        if(average<=55){
            System.out.println("Sınıfta Kaldınız");
        }else{
            System.out.println("Geçtiniz");
        }

        System.out.println("Ortalamanız : " + average);
    }
}
