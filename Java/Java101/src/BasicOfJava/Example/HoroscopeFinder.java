package BasicOfJava.Example;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int ay,gun;
        String burc="";
        boolean gunIsValid=false;
        //boolean isError=false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ay : ");
        ay=inp.nextInt();
        if(ay>=1 && ay<=12){
            System.out.print("Gun: ");
            gun=inp.nextInt();

            if(ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12){
                if(gun>=1 && gun<=31)
                    gunIsValid=true;
                else
                    gunIsValid=false;
            } else if (ay==2) {
                if(gun>=1 && gun<=28)
                    gunIsValid=true;
                else
                    gunIsValid=false;
            }else{
                if(gun>=1 && gun<=30)
                    gunIsValid=true;
                else
                    gunIsValid=false;
            }

            if(gunIsValid){
                if(ay==1){
                    if(gun<=21)
                        burc="Oğlak";
                    else
                        burc="Kova";
                }else if (ay==2){
                    if(gun<=19)
                        burc="Kova";
                    else
                        burc="Balık";
                }else if (ay==3){
                    if(gun<=20)
                        burc="Balık";
                    else
                        burc="Koç";
                }else if (ay==4){
                    if(gun<=20)
                        burc="Koç";
                    else
                        burc="Boğa";
                }else if (ay==5){
                    if(gun<=21)
                        burc="Boğa";
                    else
                        burc="İkizler";
                }else if (ay==6){
                    if(gun<=22)
                        burc="İkizler";
                    else
                        burc="Yengeç";
                }else if (ay==7){
                    if(gun<=22)
                        burc="Yengeç";
                    else
                        burc="Aslan";
                }else if (ay==8){
                    if(gun<=22)
                        burc="Aslan";
                    else
                        burc="Başak";
                }else if (ay==9){
                    if(gun<=22)
                        burc="Başak";
                    else
                        burc="Terazi";
                }else if (ay==10){
                    if(gun<=22)
                        burc="Terazi";
                    else
                        burc="Akrep";
                }
                else if (ay==11){
                    if(gun<=21)
                        burc="Akrep";
                    else
                        burc="Yay";
                }
                else if (ay==12){
                    if(gun<=21)
                        burc="Yay";
                    else
                        burc="Oğlak";
                }

                System.out.println("Burcunuz : " + burc);
            }
            else
                System.out.println("Hatali Gün Girdiniz.");
        }else
            System.out.println("Lütfen 1-12 arasında bir değer giriniz.");


        /*
        System.out.print("Ay : ");
        ay=inp.nextInt();

        System.out.print("Gun: ");
        gun=inp.nextInt();


        switch (ay){
            case 1:
                if(gun >= 1 && gun <= 31){
                    if(gun<22)
                        burc="Oglak";
                    else
                        burc="Kova";
                }else{
                    isError=true;
                }
                break;
            case 2:
                if(gun >= 1 && gun <= 28){
                    if(gun<20)
                        burc="Kova";
                    else
                        burc="Balık";
                }else{
                    isError=true;
                }
                break;
            case 3:
                if(gun >= 1 && gun <= 31){
                    if(gun<21)
                        burc="Balık";
                    else
                        burc="Koc";
                }else{
                    isError=true;
                }
                break;
            default:
                isError=true;

        }

        if(isError){
            System.out.println("Hatali giriş yaptınız");
        }else{
            System.out.println("Burcunuz : " + burc);
        }

         */
    }
}
