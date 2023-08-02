package BasicOfJava.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        /*
        double[] list1;
        list1 = new double[5];

        list1[0] = 4.1;
        System.out.println(list1[0]);
        //double list2[] = new double[10];

         */

        String[] days = {"Pazartesi", "Salı", "Çarşamba"};
        days[0]="Perşembe";
        System.out.println(days[0]);

        for(int i = 0; i<days.length;i++){
            System.out.println(days[i]);
        }
        String[] weekendDays = new String[]{"Cumartesi","Pazartesi"};
        weekendDays[0]="Pazar";
        System.out.println(weekendDays[0]);
        System.out.println(days.length);

    }
}
