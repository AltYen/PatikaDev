package WrapperClass;

public class Boxing {
    public static void main(String[] args) {
        //ilkel veri tipini, wrapper sınıfına çevirme işlemini boxing
        //wrapper sınıfını, ilkel veri tipine çevirmeye unboxing

        int a = 10;

        //Autoboxing
        Integer b = a; // Integer.valueOf(a);

        //Boxing
        Integer c = Integer.valueOf(a); // burası aslında bir nesne

        //Autounboxing
        int d = c; // c.intValue();

        //Unboxing
        int i = c.intValue();

        System.out.println(d);

    }
}
