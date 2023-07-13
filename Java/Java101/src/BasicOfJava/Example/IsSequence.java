package BasicOfJava.Example;

public class IsSequence {
    public static boolean isSequence(int arr[]){

        for (int i = 0; i<arr.length;i++){
            if(arr.length == i+1)
                break;
            if(!(arr[i]<arr[i+1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,9,7};
        System.out.println(isSequence(arr1));

    }
}
