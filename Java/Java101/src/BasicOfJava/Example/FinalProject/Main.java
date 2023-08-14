package BasicOfJava.Example.FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rowNumber=0,colNumber=0;
        while(rowNumber<2 || colNumber<2){
            System.out.print("Satır Sayısı : ");
            rowNumber = inp.nextInt();
            System.out.print("Sutun Sayısı : ");
            colNumber = inp.nextInt();
            if(rowNumber<2)
                System.out.println("Lütfen Satır sayısı 2 veya 2 den büyük bir değer girin");
            if(colNumber<2)
                System.out.println("Lütfen Sutün sayısı 2 veya 2 den büyük bir değer girin");

        }

        MineSweeper mine = new MineSweeper(rowNumber,colNumber);
        mine.run();
    }
}
