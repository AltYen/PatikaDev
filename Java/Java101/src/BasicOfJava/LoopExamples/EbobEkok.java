package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1,n2,kucukSayi,obeb=1,okek=1;

        System.out.print("1.Number : ");
        n1=inp.nextInt();
        System.out.print("2.Number : ");
        n2=inp.nextInt();

        kucukSayi = n1>n2 ? n1 : n2;
        int i = 1,j=1;
        while(i<=kucukSayi){
            if(n1%i==0 && n2%i==0)
                obeb=i;
            i++;
        }
        while(j<=(n1*n2)){
            if(j % n1 ==0 && j%n2==0){
                okek=j;
                break;
            }
            j++;
        }
        System.out.println("Obeb : "+obeb);
        System.out.println("Okek : " + okek);
        /*
        for(int i = 1; i<=kucukSayi;i++){
            if(n1 % i == 0 && n2 % i == 0){
                obeb=i;
            }
        }
        System.out.println("Obeb : " + obeb);

        for(int j = 1; j<=(n1*n2);j++){
            if(j % n1 == 0 && j % n2 == 0){
                okek=j;
                break;
            }
        }

         */
    }
}
