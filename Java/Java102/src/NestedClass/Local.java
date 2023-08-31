package NestedClass;

public class Local {
    public  void run(){
        //Methodunda içerisinde bulunan sınıflara 'Local' Sınıflar denir.
        class Yerel{
            private int a;
            Yerel(int a){
                this.a=a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y = new Yerel(15);
        System.out.println("Local sınıfı çalıştı !");
        System.out.println(y.getA());
    }

    public void print(){
        // yerel sınıfı sadece run methodu içerisinde çağırılabilir.
    }
}
