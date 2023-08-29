package AccessModifiers.Static;

import javax.swing.plaf.PanelUI;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note){
        this.name=name;
        this.code=code;
        this.note=note;
    }

    public void calcAverage(int[] notes){
        double total=0;
        for (int i : notes) {
            total += i;
        }
        double average = total/notes.length;

        System.out.println("Ortalamaniz : " + average);
    }
}
