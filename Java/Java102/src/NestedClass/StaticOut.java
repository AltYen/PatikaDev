package NestedClass;

//STATIC INNER CLASS
//Outer Class
public class StaticOut {
    public int a = 5;
    public static int b = 20;

    //static Inner Class
    public static class In{
        //public int a = 10;
        public static int a = 10;
        public static void run(){
            System.out.println("In sifina ait run methodu çalıştı");
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(StaticOut.b);
            // System.out.println(this.a); buda kullanılamaz çünkü bu sınıftan nesne üretilmesi gerekir.
        }
    }

    public void run(){
        In.run();
    }
}
