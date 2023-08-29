package AccessModifiers.PublicPrivateProtected.first;

public class Main {
    public static void main(String[] args) {
        First a = new First("Alt");
        System.out.println(a.str); // First sınıfındaki str i procted yaptığımız zaman buradaki mainden bir sorun olmadan ulaşabiliyoruz ancak first paketi dışındaki herhangi bir sınıf erişemez hale geliyor.
        //a.showStr();
        //a.show();
    }
}
