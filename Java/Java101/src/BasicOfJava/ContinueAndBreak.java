package BasicOfJava;

public class ContinueAndBreak {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10;i++){
            if(i==5){
                System.out.println("i = 5");
                break;
            }
            System.out.println(i);

        }

        for (int i = 1; i <= 10;i++){
            if(i==5)
                continue;
            System.out.println(i);

        }

         */

        /*
        int i = 1;
        while(i<=10){
            i++;
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);

        }

         */


        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }

    }
}
