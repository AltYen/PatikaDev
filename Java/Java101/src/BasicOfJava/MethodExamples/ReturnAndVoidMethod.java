package BasicOfJava.MethodExamples;

public class ReturnAndVoidMethod {

    static int sum(int a,int b){
        return a+b;
    }

    static void sumVoid(int a,int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int result = sum(5,2);
        System.out.println(result);
        System.out.println(sum(5,2));
        System.out.println(sum(5,2) + sum(3,1));

        sumVoid(5,2);

    }
}
