package AccessModifiers.Static;

public class Calculate {
    // static değişken veya metotlar, objelere ait değişken ve metot olmaktan çıkıp, sınıflara ait oluyorlar. sınıftan nesne üretilmeden, sınıf üzerinden kullanılabilir.
    public static void calcAverage(int[] notes){
        double total=0;
        for (int i : notes) {
            total += i;
        }
        double average = total/notes.length;

        System.out.println("Ortalamaniz : " + average);
    }

    public static void calcAverage(Course[] notes){
        double total=0;
        for (Course i : notes) {
            total += i.note;
        }
        double average = total/notes.length;

        System.out.println("Ortalamaniz : " + average);
    }
}
