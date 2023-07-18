package BasicOfJava.MethodExamples;

public class RecursiveMethods {

    static int f(int n){ //recursive methodlar voidte işe yara maz;
       int result = 0;
       for(int i=1;i<=n;i++){
           result+=i;
       }
       return result;
    }

    // kademeli olarak en küçük parçayı bulduktan sonra tekrardan en üste kadar üst üste koya koya  gider.
    //recursive fonksiyonun bir bitiş değeri olmalı.
    static int r(int n){
        System.out.println("n => "+n);
        if(n==1)
            return 1;
        int result = r(n-1) + n;
        System.out.println("result => " + result);
        return result;
    }
    public static void main(String[] args) {
        //System.out.println(f(2));

        System.out.println(r(4));

        //f(1) = 1
        //f(2) = 1 + 2
        //f(3) = 1 + 2 + 3
        //f(4) = 1 + 2 + 3 + 4
        //f(n) = f(n-1) + n;
    }
}
