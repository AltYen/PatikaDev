package CoderbyteChallenges;

public class LargestNumberOccurs {
    static void calculate(int[] arr){
        int maxNumber = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxNumber){
                if(getRepeatCount(arr,arr[i]) == arr[i]){
                    maxNumber=arr[i];
                }
            }
        }
        System.out.println(maxNumber);
    }

    static int getRepeatCount(int[] arr, int number){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(number == arr[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //Given an array of integers and an integer ‘k’, the task is to find the largest element from the array that is repeated exactly ‘k’ times.
        int[] arr = {3,8,2,3,3,2};
        calculate(arr);
    }
}
