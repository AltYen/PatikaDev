package AccessModifiers.Static;

public class Main {
    /*
    // static bir method içerisinde static method çağırabilirsin.
    public static void print(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Player p1= new Player("Mustafa Cetindag",1);
        p1.login();
        //System.out.println(p1.count);
        System.out.println(Player.count);

        Player p2= new Player("Kodluyoruz",2);
        p2.login();
        System.out.println(Player.count);

        Player p3= new Player("Patika",3);
        p3.login();
        System.out.println(Player.count);


        p1.showName();
        //Player.showName(); eğer showName methodu static tanımlanırsa.
    }

     */

    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT-101",70);
        Course fizik = new Course("Fizik","FZK-101",20);
        Course kimya = new Course("Kimya","KMY-101",100);

        int[] notlar = {mat.note, fizik.note, kimya.note};
        Course[] dersler = {mat,fizik,kimya}; // course üretilmiş nesneleri tutan bir obje dizisi
        mat.calcAverage(notlar);

        Calculate calc = new Calculate(); // buradaki yapmak istediğimiz işlemin aslında bir nesneyle alakası yok.
        calc.calcAverage(notlar);

        Calculate.calcAverage(notlar); // o yüzden calcAverage methodunu static olarak tanımlayıp, herhangi bir nesne üretmeden direk sınıf üzerinden bu şekilde çağırabiliriz.
        Calculate.calcAverage(dersler);
    }
}
