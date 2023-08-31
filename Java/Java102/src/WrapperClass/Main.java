package WrapperClass;

public class Main {
    public static void main(String[] args) {
        //ilkel veri tiplerimizi, onların wrapper sınıfları sayesinde nesne gidi davranıp, onların hazır özelliklerini kullanabiliyoruz.
        //Generic yapılar wrapper sınıfları kabul eder!

        /*
        Integer a = 20;
        String str = a.toString();
        Short s = 2;
        System.out.println(str);

         */

        String a="10";
        int c = Integer.parseInt(a);
        int b=20;
        System.out.println(c+b);
        System.out.println(Integer.sum(10,20));

    }
}
