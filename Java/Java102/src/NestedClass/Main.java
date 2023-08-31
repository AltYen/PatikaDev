package NestedClass;

public class Main {
    //örnek olarak bir araba sınıfı ve motor sınıfı var, motor sınıfı tek başına bir işlem görmüyecekse bu motor sınıfını araba sınıfının içerisinde oluşturabiliriz.
    public static void main(String[] args) {
        //Out java sınıfının içerisinde bulunan In sınıfına mantıken direk olarak erişemeyiz. In'e erişmek için önce Out'a erişmeliyiz
        //-------------------------- NON STATIC INNER CLASS --------------------

        /*
        Out o = new Out();
        o.run();
         */

        /*
        // Bir sınıfın içerisindeki iç sınıfa ulaşmak için kullanılan tanımlama örneği

        Out o = new Out();
        Out.In inNesnesi = o.new In();
        inNesnesi.run();

        Out o2 = new Out();
        Out.In in = o2.new In();
        in.run();

         */

        /*
        //dış sınıfta iç sınıfa ulaşabilecek method oluşturup, bu methodu kullanarak erişme
        Out o = new Out();
        Out.In inNesnesi = o.getIn();
        inNesnesi.run();
         */
        //-------------------------- NON STATIC INNER CLASS --------------------


        //-------------------------- STATIC INNER CLASS --------------------
        /*
            STATIC INNER CLASS
            // static inner classlara bu şekilde ulaşabiliriz.
            StaticOut.In.run(); // çağıralacak methotda static olmalı
         */
        //-------------------------- STATIC INNER CLASS --------------------

        //-------------------------- LOCAL CLASS --------------------
          /*
            Local l = new Local();
            l.run();
           */
        //-------------------------- LOCAL CLASS --------------------

        //-------------------------- ANONIM CLASS --------------------
            Anonim a = new Anonim(){
                // burası aslında anonim sınıfının içerisindeki kod bloğu gibi düşünebiliriz.
                // sınıfa ait değişken ve metot tanımlayabiliriz.
                // burada yapılan işlemler sadece oluşturulan nesneye özeldir!

                // public int a = 20; bu tanımlı ise => 20 yazar | tanımlı değilse 10
                @Override
                public void run(){
                    System.out.println(this.a);
                    System.out.println("Anonim olarak yazılmış run metodu !");
                    print();// bu şekilde kullanabilirsin.
                }

                // hiç var olmayan bir methodu direk nesne üzerinden çağıramazsın, var olan bir method içerisinden çağırabilirsin
                // diğer türlü sadece var olan bir metodu override ederek kullanabilirsin.
                public void print(){
                    System.out.println("Print Metodu");
                }
            };
            a.run();
            // a.print(); bu şekilde kullanamazsın.
        //-------------------------- ANONIM CLASS --------------------




    }
}
