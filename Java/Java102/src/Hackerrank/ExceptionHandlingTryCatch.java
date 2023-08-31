package Hackerrank;

import java.util.*;

public class ExceptionHandlingTryCatch {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            int x = in .nextInt();
            int y = in .nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
