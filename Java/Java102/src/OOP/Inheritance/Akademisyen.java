package OOP.Inheritance;

public abstract class Akademisyen extends Calisan{ // herhangi bir sınıftan kalıtım yapmanın yöntemi

    private String bolum;
    private String unvan;

    // atası olan, kalıtım yapılan sınıfta constructor varsa kendi içerisinde de çağırmak zorunda
    // kalıtım alınan sınıfta constuctor varsa, alan sınıfta bu constructoru koymak zorunda.
    // bahsi gecen, koyulması zorunlu constructor
    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    //abstract metodların bodysi olamaz!
    public abstract void derseGir(String dersSaati);

    // method overriding
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyeni A kapısından giriş yaptı !");
    }
}
