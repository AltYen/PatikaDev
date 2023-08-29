package OOP.RelationBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa","Çetindağ","123","AA",85);
        Student st2 = new Student("Patika","Dev","2321","BB",85);
        Student st3 = new Student("Kodluyoruz","Java102","12312","CC",85);

        Instructor teacher = new Instructor("Alt","Yen","CENG");


        // course sınıfına ait herhangi bir method farklı bir sınıftan parametre alıyorsa, farklı bir sınıftan nesne üretiyorsa, o sınıfa bağlı hale geliyor
        // Course sınıfı bir instructor'a sahip | Composition, Aggregation
        // örnek olarak bu örnekte instructori tek başına oluşturup,kullanabiliriz. buna aggregation deniyor. kısaca 2 sınıf birbiriyle bir has ilişkisi var ancak instructor tek başınada çalışabilir.
        // eğer instructor tek başına bir anlamı olmasaydı composition derdik. birbirlerine tamamlıyorlar.
        Course mat = new Course("MAT101","MAT",teacher);
        System.out.println(mat.getInstructor().getName()); // composition

        /*
        Student[] stu = {st1,st2,st3};
        System.out.println("Ortalama : " + mat.calcAverage(stu));

         */



    }
}
