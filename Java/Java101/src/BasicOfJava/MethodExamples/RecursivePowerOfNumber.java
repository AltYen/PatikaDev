package BasicOfJava.MethodExamples;

import java.util.Scanner;

public class RecursivePowerOfNumber {
    static int power(int t,int u){
        if(u == 0)
            return 1;
        return t*power(t,u-1);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taban,us;
        System.out.print("Taban değerini giriniz: ");
        taban=inp.nextInt();
        System.out.print("Us değerini giriniz: ");
        us=inp.nextInt();

        System.out.println(taban + "^" + us + " = " + power(taban,us));
    }
}
