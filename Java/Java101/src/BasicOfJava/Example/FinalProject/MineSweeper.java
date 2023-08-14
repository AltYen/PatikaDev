package BasicOfJava.Example.FinalProject;

import java.util.Scanner;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    int bombCount;

    MineSweeper(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.bombCount=(rowNumber * colNumber)/4;
    }

    void run(){
        Scanner inp = new Scanner(System.in);
        int row,col,totalMoveCount;

        System.out.println("Mayinlarin Konumu");
        String[][] dashboard = createDashboard(this.rowNumber,this.colNumber);
        String[][] dashboardWithMines = putMines(createDashboard(this.rowNumber,this.colNumber));
        printDashboard(dashboardWithMines);

        totalMoveCount = (this.rowNumber*this.colNumber) - this.bombCount;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        while(totalMoveCount != 0){

            System.out.print("Satır Giriniz : ");
            row=inp.nextInt()-1; // kullanıcından satır ve sutun sayılarını daha düzgün almak için -1 eklendi;
            System.out.print("Sütun Giriniz : ");
            col=inp.nextInt()-1; // kullanıcından satır ve sutun sayılarını daha düzgün almak için -1 eklendi;

            if((row+1<=0 || row+1>dashboard.length) || (col+1<=0 || col+1>dashboard[0].length)){ // row ve col +1 yapıldı çünkü inp.nextInt yapılırken -1 verilmişti.
                if((row+1<=0 || row+1>dashboard.length))
                    System.out.println("Satır değerini 1-"+this.rowNumber+" arasında giriniz...");
                if((col+1<=0 || col+1>dashboard[0].length))
                    System.out.println("Sütun değerini 1-"+this.colNumber+" arasında giriniz...");
                continue;
            }
            if(dashboard[row][col]!="-"){
                System.out.println("Bu hamleyi zaten oynadın, lütfen farklı değerler ile tekrar dene.");
                continue;
            }

            totalMoveCount--;

            if(totalMoveCount==0){
                System.out.println("KAZANDIN");

            }
            if(dashboardWithMines[row][col] == "*"){
                System.out.println("Bombaya bastin. KAYBETTİN !");
                dashboard[row][col] = "X";
                printDashboard(dashboard);
                break;
            }

            dashboard[row][col] = String.valueOf(nearByBombCount(dashboardWithMines,row,col));
            printDashboard(dashboard);
            System.out.println("=================");
        }
    }

    public static String[][] createDashboard(int row,int col){
        String[][] dashboard = new String[row][col];
        for(int i = 0;i<dashboard.length;i++){
            for(int j = 0;j<dashboard[i].length;j++){
                dashboard[i][j]="-";
            }
        }
        return dashboard;
    }

    public String[][] putMines(String[][] dashboard){
        int bombCount = 0;
        while(bombCount<this.bombCount){
            int randomRow = (int)(Math.random()*dashboard.length);
            int randomCol = (int)(Math.random()*dashboard[0].length);
            if(dashboard[randomRow][randomCol] != "*"){
                bombCount++;
                dashboard[randomRow][randomCol] = "*";
            }
        }
        return dashboard;
    }
    public static void printDashboard(String[][] dashboard){
        for(String[] i: dashboard){
            for(String j:i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static int nearByBombCount(String[][] dashboardWithMines,int row,int col){
        int count=0,rowMin,rowMax,colMin,colMax;
        rowMin = row-1 < 0 ? 0 : row-1;
        rowMax = row+1 >= dashboardWithMines.length-1 ? dashboardWithMines.length-1 : row + 1;
        colMin = col-1 < 0 ? 0 : col-1;
        colMax = col+1 >= dashboardWithMines[0].length-1 ? dashboardWithMines[0].length-1 : col + 1;

        /*
        if(row-1 < 0)
            rowMin=0;
        else
            rowMin=row-1;

        if(row+1 >= dashboardWithMines.length-1)
            rowMax=dashboardWithMines.length-1;
        else
            rowMax=row+1;

        System.out.println(rowMin);
        System.out.println(rowMax);
         */

        for (int i = rowMin; i <= rowMax; i++) {
            for (int j = colMin; j <= colMax ; j++) {
                if(dashboardWithMines[i][j] == "*")
                    count++;
            }
        }

        return count;
    }

}

