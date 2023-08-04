package BasicOfJava.Arrays;

import  java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        /*
        int[] list = {1,2,3,4};
        int[] list2 = {4,6,832,5723,24};
        double[] list3 = {1.1,2.2,3.3,4.4};

        HelperArray helper = new HelperArray();
        HelperArray.print(list); // static olduğu için nesne oluşturmadan direk çağırabildik.
        HelperArray.print(list2); // static olduğu için nesne oluşturmadan direk çağırabildik.
        helper.print(list3);

         */

        /*
        Arrays.toString | Arrays.fill Kullanımı
        double[] list2 = {4,6,832,5723,24};
        //System.out.println(Arrays.toString(list2));

        int[] list = {1,2,3,4,5,6,7};
        list = HelperArray.fill(list,10);
        System.out.println(Arrays.toString(list));

        int[] list3= {1,2,3,4,5,6,7};
        Arrays.fill(list3,2,5,7);
        System.out.println(Arrays.toString(list3));
         */

        int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        /* Arrays.sort
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
         */

        /* Arrays.binarySearch
        System.out.println(HelperArray.search(list,21));
        Arrays.sort(list);
        System.out.println(Arrays.binarySearch(list,55));//binarysearch sırali dizilerde sürekli ortanca değere bakarak yarı yarıya bölerek arama yapar.
         */

        /* // Arrays.copyOf | Arrays.copyOfRange
        int[] copyList = Arrays.copyOf(list,list.length);
        int[] copyList2 = Arrays.copyOfRange(list,2,5); // üst limit dahil edilmiyor.
        System.out.println(Arrays.toString(copyList));
        System.out.println(Arrays.toString(copyList2));

         */

        // Arrays.equals
        int[] lt = {1,2,3};
        int[] lt2 = {1,2,3};
        int[] lt3 = {3,5,3};

        System.out.println(Arrays.equals(lt,lt3)); // hazır array sınıfından gelen.
        System.out.println(HelperArray.equals(lt,lt3)); // kendi yazdığımız method

    }
}
