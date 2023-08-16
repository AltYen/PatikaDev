package BasicOfJava.Example;

public class FindMostAndFirstRepeatingNumber {

    static void findRepeatingNumber(int[] arr){
        int repeatCount = 0, number = -1,tempNumber=0,tempRepeatCount=0;
        for(int i = 0;i<arr.length;i++){
            tempNumber=arr[i];
            for (int j = 0;j<arr.length;j++){
                if(tempNumber==arr[j]){
                    tempRepeatCount++;
                }
            }
            if((tempRepeatCount > 1) && (tempRepeatCount>repeatCount)){
                repeatCount=tempRepeatCount;
                number=arr[i];
            }
            tempRepeatCount=0;

        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        /*
           bir dizideki en çok tekrar eden sayıyı bulan algoritma
           eğer aynı sayıda tekrar eden sayı varsa ilk olan dönmeli.
           tekrar eden sayı yok ise -1 dönmeli.
        */

        int[] arr = {4,5,6,1,2,4};
        findRepeatingNumber(arr);


    }
}
