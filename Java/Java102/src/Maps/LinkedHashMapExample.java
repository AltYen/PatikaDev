package Maps;

import Collections.TreeSet.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();
        students.put(102,new Student("Mustafa",100));
        students.put(110,new Student("Damla",25));
        students.put(108,new Student("Ahmet",77));
        students.put(118,new Student("Cemre",40));

        //girilen sıra ile çıkan sıra aynı.
        for (Student stu : students.values()){
            System.out.println(stu.getName());
        }
    }
}
