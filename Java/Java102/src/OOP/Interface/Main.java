package OOP.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //bir sınıf birden fazla interface implemente edebilir.
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz : ");
        double price = input.nextDouble();
        System.out.print("Kart No giriniz : ");
        String cardNumber = input.next();
        System.out.print("Son Kullanım Tarihi giriniz : ");
        String expireDate = input.next();
        System.out.print("Güvenlik Kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası \n2. B Bankası \n3. C Bankası ");
        System.out.print("Banka Seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABanka aPos = new ABanka("A Bankası","2141242142","211252152");
                aPos.connect("1.1.1.1");
                aPos.payment(price,cardNumber,expireDate,cvc);
                break;
            case 2:
                BBanka bPos = new BBanka("B Bankası","2141242142","211252152");
                bPos.connect("1.1.1.1");
                bPos.payment(price,cardNumber,expireDate,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz");
        }

    }
}
