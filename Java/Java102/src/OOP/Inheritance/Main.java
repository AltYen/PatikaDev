package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        // JAVADA BIR SINIF SADECE 1 SINIFTAN KALITIM YAPABILIR
        Calisan c1=new Calisan("Mustafa Cetindag","0500000000","info@patika.dev");

        Akademisyen a1 = new Akademisyen("Patika Dev","05000000124","bilgi@patika.dev","CENG","Doçent");

        Memur m1 = new Memur("Ali Veli","060000224","a@patika.dev","Bilgi İslem","09:00-18:00");
        //m1.calis();

        OgretimGorevlisi o1= new OgretimGorevlisi("Mahmut Cetindağ","0","mahmut@patika.dev","CENG","Docent","110");
        /*
        //Method Overloading Örneği
        o1.giris(); // hem akademisyen hemde calisan sınıfına erişebilir.
        o1.giris("10:00");
        o1.giris("10:00","18:00");
        o1.derseGir();
        */

        //Polimorfizm
        // referansı ata sınıfından gösterip, constructorunu alt sınıfından göstererek, nesneler üretebiliriz. buna polimorfizm diyoruz.
        // Örnek => Calisan a1 = new Akademisyen("Patika Dev","05000000124","bilgi@patika.dev","CENG","Doçent");
        // yukaridaki örnekte calisan akademisyenin kendi özel şeylerine erişemez. yani a1.getBolum gibi akademisyene ait şeylere erişimi yok. sadece override edilmiş noktalara erişebilir.
        Calisan[] loginUser = {c1,a1,m1,o1};
        Calisan.girisYapanlar(loginUser);

        /*
        GuvenlikGorevlisi gg1 = new GuvenlikGorevlisi("Ahmet Hakan","11","asfaf@gmail.com","CENG","12:00-00:00","A1");
        System.out.println(gg1.getMesai());
        gg1.nobet();
         */
    }
}
