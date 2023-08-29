package AccessModifiers.Final;

public class Daire {
    public int r;
    public final double PI_SAYISI = 3.14; // final bundan sonra değiştirilemez anlamına geliyor, sabit değer.sabitler tanımlanırken değişken ismi olarak "PI_SAYISI" örneği gibi tanımlanır.

    public Daire(int r){
        this.r=r;
    }

    public void calcArea(){
        double area = PI_SAYISI * this.r * this.r;
        System.out.println("Dairenin Alanı : " + area);
    }
}
