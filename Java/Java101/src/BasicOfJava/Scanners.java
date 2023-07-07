import java.util.Scanner;
public class Scanners {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını Giriniz: ");
        a = input.nextInt();
        System.out.println(a);

        System.out.print("Bir Deger Giriniz: ");
        double b = input.nextDouble();
        input.nextLine(); // hacky solution
        System.out.println(b);

        System.out.print("İfade Giriniz: ");
        String str = input.nextLine();
        System.out.println(str);
    }
}
