package BasicOfJava.Example;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        String username,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adi : ");
        username=inp.nextLine();

        System.out.print("Sifre : ");
        password=inp.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Hatali Giriş");
            System.out.print("Şifrenizi Sıfırlamak Istermisiniz ? (e/h) : ");
            String secim = inp.nextLine();
            if(secim.equals("e")){
                System.out.print("Yeni Şifre : ");
                String newPassword = inp.nextLine();
                if(password.equals(newPassword) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Program Bitti.");
            }
        }
    }
}
