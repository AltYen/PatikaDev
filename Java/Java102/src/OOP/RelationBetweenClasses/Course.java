package OOP.RelationBetweenClasses;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor; // bir sınıfa ait parametrelerden herhangi biri başka bir sınıfı temsil ediyorsa, bu sınıf o sınıfı içerir. has a ilişkisi

    public Course(String courseName, String code,Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    //Course,Student sınıfını kullanıyor, yani Course sınıfı Student Sınıfına bagli.
    public double calcAverage(Student[] students){
        double average=0;
        for(Student s:students){
            average+=s.getNote();
        }
        return average / students.length;
    }
}
