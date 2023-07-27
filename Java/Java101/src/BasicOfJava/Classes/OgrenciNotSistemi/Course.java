package BasicOfJava.Classes.OgrenciNotSistemi;

public class Course {
    //bir sınıfın niteliğine diğer bir sınıfı nitelik olarak atayabiliriz.
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int verbalNote=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }
        else
            System.out.println("Öğretmen ve Ders Bölümleri uyuşmuyor !");
    }

    void printTeacherInfo(){
        // Teacher sınıfından üretilmiş nesne'ye ait methodun çağrılması.
        this.teacher.print();
    }


}
