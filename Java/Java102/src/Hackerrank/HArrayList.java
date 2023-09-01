package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class HArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int y = scanner.nextInt();
            ArrayList<Integer> lineValues = new ArrayList<>();
            for(int j=0;j<y;j++){
                lineValues.add(scanner.nextInt());
            }
            lines.add(lineValues);
        }

        int guestCount = scanner.nextInt();
        for(int i = 0;i<guestCount;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                System.out.println((lines.get(x-1)).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        /*
        for(int i = 0;i<lines.size();i++){
            for(int j=0;j<lines.get(i).size();j++){
                System.out.print(lines.get(i).get(j) + " ");
            }
            System.out.println();
        }
        */
        scanner.close();

    }
}
