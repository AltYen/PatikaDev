package BasicOfJava;

public class JavaMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100)); // Mutlak Değer
        System.out.println(Math.cbrt(8)); // küp kök
        System.out.println(Math.ceil(1.12)); // en yakın üst  sayıya yuvarlama.
        System.out.println(Math.floor(1.99)); // en yakın alt  sayıya yuvarlama.
        System.out.println(Math.log10(100)); // log10
        System.out.println(Math.max(100,200)); // büyük değeri bulma,
        System.out.println(Math.pow(2,6)); // üst alma 2^6
        System.out.println(Math.random()*10); // rastgele 0 ile 1 arasında değer üretme | * 10 ile 0-10 arasında üretmesini sağlıyoruz.
        System.out.println(Math.round(10.99)); // hangi kısma yakınsa 0.5ten büyükse üste, azsa aşağı yuvarlar. tam sayı
        System.out.println(Math.rint(10.99)); // hangi kısma yakınsa 0.5ten büyükse üste, azsa aşağı yuvarlar. double
        System.out.println(Math.signum(-1000)); // sayının pozitif negatif olduğunu bulma.
        System.out.println(Math.sqrt(4)); // karekök alma
    }
}
