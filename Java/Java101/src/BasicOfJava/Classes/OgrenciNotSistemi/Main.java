package BasicOfJava.Classes.OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Mahmut","TRH","905426528979");
        Teacher t2= new Teacher("Graham Bell","FZK","905426528989");
        Teacher t3= new Teacher("Külyatmaz","BIO","905426528990");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);//Teacher sınıfından üretilmiş nesneyi Course sınıfındaki Teacher niteliğine atıyoruz.

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Inek Saban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkVerbalNote(60,40,50);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkVerbalNote(90,100,80);
        s2.isPass();

    }
}
