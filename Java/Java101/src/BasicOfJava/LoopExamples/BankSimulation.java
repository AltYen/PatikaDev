package BasicOfJava.LoopExamples;

import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String username,password;
        int kalanHak = 3;
        int bakiye=1500;
        int islemSecim = 0;
        int miktar;

        while(kalanHak>=1){
            System.out.print("Username : ");
            username=inp.nextLine();

            System.out.print("Password : ");
            password=inp.nextLine();

            if(username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    islemSecim=inp.nextInt();
                    System.out.println("---");

                    switch (islemSecim){
                        case 1:
                            System.out.print("Para miktarı : ");
                            miktar = inp.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            miktar = inp.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case 4:
                            islemSecim=4;
                            break;
                        default:
                            System.out.println("Lütfen 1-4 arasi bir değer girin");
                            break;
                    }
                    /*
                    if(islemSecim == 1){
                        System.out.print("Para miktarı : ");
                        int price = inp.nextInt();
                        bakiye += price;
                    }else if (islemSecim == 2) {
                        System.out.print("Para miktarı : ");
                        int price = inp.nextInt();
                        if (price > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            bakiye -= price;
                        }
                    }else if (islemSecim == 3) {
                        System.out.println("Bakiyeniz : " + bakiye);
                    }
                     */
                    System.out.println("---");

                }while(islemSecim != 4);
                System.out.println("Başarıyla çıkış yaptınız.");
                break;
            }else{
                kalanHak--;
                if(kalanHak==0)
                    System.out.println("Hesabınız bloke olmuştur");
                else {
                    System.out.println("Yanlış kullanıcı adı veya şifre");
                    System.out.println("Kalan Deneme Hakkınız : " + kalanHak);
                }
            }
        }
    }
}
