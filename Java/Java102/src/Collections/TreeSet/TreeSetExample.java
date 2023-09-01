package Collections.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSetlerde zorunlu olarak bir sıralama yöntemi vermek zorundayız.
        // notlara göre tersten sıralama | tersten sıralama için .reversed()
        //TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed()); // sıralamaya göre set oluşturuyor. Sıralamayı neye göre yapacak bunu belirtmeliyiz.
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator()); // isme göre sıralama


        // Student s1 = new Student("Mustafa",10); TreeSet'e zaten generic olarak Student veri tipi dediğimiz için bu şekilde yapmak yerine alttaki gibi yapabiliriz
        students.add(new Student("Mustafa",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Behlül",45));
        students.add(new Student("Damla",60));
        //students.add(new Student("Damla",60)); setlerde her zaman unique kayıtlar olur!
        students.add(new Student("Cemre",60));

        for (Student stu: students){
            System.out.println(stu.getName());
        }
    }
}
