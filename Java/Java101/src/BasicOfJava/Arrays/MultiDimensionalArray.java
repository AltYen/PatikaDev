package BasicOfJava.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] list = new int[5];

        int[][] list2 = new int[6][6]; //ilk [] satır 2. [] sutunu belirtir.

        /*
        int[][] matris ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
         */

        int[][] matris = new int[3][4]; // çok boyutlu dizilerde 2 for gerekli.
        int number = 1;
        System.out.println(matris.length); // satır sayısı.
        System.out.println(matris[0].length); // sutun sayısı
        for(int i = 0; i< matris.length;i++){
            for(int j = 0; j<matris[i].length;j++){
                matris[i][j]=number++; // number++ => numberi değişkene ata ardından number değerini 1 arttır | ++number => önce number değerini arttır sonra değişkene ata.
            }
        }

        for (int i = 0; i< matris.length; i++){
            for (int j = 0; j<matris[i].length;j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

    }
}
