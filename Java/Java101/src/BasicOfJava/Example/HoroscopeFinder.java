package BasicOfJava.Example;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int ay,gun;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ay : ");
        ay=inp.nextInt();

        System.out.print("Gun: ");
        gun=inp.nextInt();


        switch (ay){
            case 1:
                if(gun >= 1 && gun <= 31){
                    if(gun<22)
                        System.out.println("Oğlak Burcu");
                    else
                        System.out.println("Kova Burcu");
                }else{
                    System.out.println("Hatali Gün");
                }
                break;
            case 2:
                if(gun >= 1 && gun <= 28){
                    if(gun<19)
                        System.out.println("Oğlak Burcu");
                    else
                        System.out.println("Kova Burcu");
                }else{
                    System.out.println("Hatali Gün");
                }
                break;
            default:
                System.out.println("Hatalı ay");

        }
    }
}
