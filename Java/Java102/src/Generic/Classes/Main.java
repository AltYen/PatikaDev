package Generic.Classes;

public class Main {
    public static void main(String[] args) {
        /*
        String s; // undefined
        String s1=null; //null
        String s2=""; //empty

        String str = null;
        NullableString n = new NullableString(str);
        n.run();

        Integer a = null;
        NullableInteger ni = new NullableInteger(a);
        ni.run();

         */

        // generic classlar ilkel veri tipleri ile çalışmaz! Wrapper sınıflar ile çalışır
        Integer a = 12;
        String str = "abc";
        Nullable<Integer> n = new Nullable<>(a); // generic sınıfa ait nesne tanımlama
        Nullable<String> n2 = new Nullable<>(str); // generic sınıfa ait nesne tanımlama
        n.run();
        n2.run();

        //--------generic class with multiple data types
        Integer z = 10;
        String x = "patika";
        Double d = 3.14;
        String c = "dev";
        //Generic sınıfta ne kadar veri tipi tanımlanmış ise hepsini yazmak zorundayız! 3 argüman alıyorsa 3 tane göndermek zorundayız
        Test<String,Integer,Double> t = new Test(x,z,d); // constructor methoddaki sıralama önemli!, oradaki sıraya göre göndermemiz gerekli

        t.setObj1(c);
        t.showInfo();


    }
}
