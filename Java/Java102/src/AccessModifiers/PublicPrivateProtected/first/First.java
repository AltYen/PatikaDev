package AccessModifiers.PublicPrivateProtected.first;

public class First { // bir sınıfı private tanımlamanın hiç bir anlamı yok, o sınıfa ulaşamayız,nesne üretemeyiz, v.b
    protected String str; // private olduğu zaman sadece bu sınıfın içerisinden erişilebilir hale geliyor. dış hiçbir sınıf normal şartlarda buna erişemez.(encapsulation ile erişilebilir.)
    // protected sadece bulunduğu paket içerisindeki sınıflardan erişilebilir.

    //herhangi bir erişim belirleyici belirtilmez ise sadece bulunduğu paket içerisinden ulaşabilir kabul ediliyor.

    public First(String str){
        this.str=str;
    }

    protected void show(){ // sadece bulunduğu paket içeresindeki diğer sınıflardan çağrılabilir.
        System.out.println(this.str);
    }

    /*
    private void showStr(){
        System.out.println(this.str);
    }
    // private methoda yine dış bir sınıftan erişmek için kullanılan yöntem.
    void show(){
        this.showStr();
    }
     */
}
