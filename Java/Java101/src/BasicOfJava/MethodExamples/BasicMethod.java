package BasicOfJava.MethodExamples;

public class BasicMethod {
    //main methodu static ise main methodu içerisindeki methodlarda static olmalı.
    // method içerisine method tanımlaması yapılamaz.
    static int power(int base,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
    }

    static void helloWorld(){
        System.out.println("Merhana Dünya");
    }

    public static void main(String[] args) {
        int case1=power(2,3);
        System.out.println(case1); // gönderilen değerler, methoddaki parametre tipleri ile uyumlu olmalı, int ise int gönder.
        System.out.println(power(4,3));
        helloWorld();

    }
}
