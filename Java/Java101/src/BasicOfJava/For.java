package BasicOfJava;

public class For {
    public static void main(String[] args) {
        for (int sayac = 3; sayac<=10; sayac +=2){
            System.out.println(sayac);
        }

        System.out.println("----");

        int k = 3;
        while(k<=10){
            System.out.println(k);
            k+=2;
        }

        /*
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);


        for(int i =7;i<=77;i+=7){
            System.out.println(i);
        }

         */
    }
}
