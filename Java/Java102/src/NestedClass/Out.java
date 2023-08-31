package NestedClass;

//NON STATIC INNER CLASS
//Outer Class
public class Out {
    public int a = 5;

    //Inner Class
    public class In{
        public int a = 10;

        public void run(){
            System.out.println("In sifina ait run methodu çalıştı");
            int a = 1;
            System.out.println(a); // 1 | metotdaki local değişken
            System.out.println(this.a); // 10 // sınıf içerisindeki a değişkeni
            System.out.println(Out.this.a); // 5 // eğer dış bir sınıf varsa dış sınıftaki değerlere bu şekilde ulaşabiliriz.
            //Out.this.run(); sonsuz döngü girer.
        }
    }

    public void run(){
        In in = new In();
        in.run();
    }

    // iç sınıfa erişmek için kullanılabilecek method çözümü
    public In getIn(){
        //In in = new In();
        //return in;

        return new In();
    }
}
