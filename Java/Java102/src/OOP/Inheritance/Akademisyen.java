package OOP.Inheritance;

public class Akademisyen extends Calisan{ // herhangi bir sınıftan kalıtım yapmanın yöntemi

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

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " dersi giriş yaptı !");
    }
}
