package CoderbyteChallenges;

public class LargestNumberOccurs {
    static void calculate(int[] arr){
        int maxNumber = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxNumber && checkOccursCount(arr,arr[i])){
                    maxNumber=arr[i];
            }
        }
        System.out.println(maxNumber);
    }

    static boolean checkOccursCount(int[] arr, int number){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(number == arr[i])
                count++;
        }
        if(count == number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //Given an array of integers and an integer ‘k’, the task is to find the largest element from the array that is repeated exactly ‘k’ times.
        int[] arr = {2,5,6,3,11,9,1};
        calculate(arr);
    }
}
