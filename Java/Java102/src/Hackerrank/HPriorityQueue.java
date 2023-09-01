package Hackerrank;


import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}
/*
class Priorities {

    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}
 */
class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> st = new PriorityQueue<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                int cgpaComparison = Double.compare(o2.getCGPA(), o1.getCGPA());

                if (cgpaComparison == 0) {
                    return o1.getName().compareTo(o2.getName());
                }

                return cgpaComparison;
            }
        });
        for(int i = 0;i<events.size();i++){
            String[] handleEvent = events.get(i).split(" ");
            if(handleEvent[0].equals("ENTER")){
                st.add(new Student(Integer.valueOf(handleEvent[3]),handleEvent[1],Double.valueOf(handleEvent[2])));
            }else{
                st.poll();
            }
        }
        while(st.size() > 1){
            System.out.println(st.poll().getName());
        }
        return new ArrayList<Student>(st);
    }
}

public class HPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
