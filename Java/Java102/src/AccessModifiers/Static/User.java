package AccessModifiers.Static;

public class User {
    public String name;
    public static int counter=0; // counter bir değer atanmasa bile genel yapılan bir hata olduğu için 0 olarak başlatıyor.

    /*
    {
        System.out.println("Ben bir static kod bloguyum");
    }*/
    // başına static yazmassak her nesne üretildiğinde calisir.
    static {
        System.out.println("2.Static Kod Blodu");
        int random  = (int) (Math.random() * 10);
        System.out.println("3.Random Sayı: " + random);
        counter=random;
        System.out.println("4.Counter Varsayılan deger " + counter);
    }


    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter Yeni değer : " + counter);

    }
}
