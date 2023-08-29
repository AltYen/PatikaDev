package AccessModifiers.Static;

public class Player {
    public String name;
    public int id;

    public static int count = 0;  // static tanımlanan değişkenler veya metodlar, nesne üretmeden hafızada otamatik yer kaplar.
    // nesneden bağımsızdır istenirse 100 tane nesne üretilsin, static olduğu için hepsinde aynı değer taşır,
    // staticler nesnelere değil, sınıflara ait değişkenlerdir.
    public Player(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void login(){
        count++;
    }

    public void showName(){ // methoda statik verildiğinde nesne üretilmeden direk sınıf üzerinden erişilebilmesini sağlar.
        System.out.println(this.name);
        //System.out.println(this.count); bu yanlış bir kullanım
        System.out.println(Player.count);
    }

}
