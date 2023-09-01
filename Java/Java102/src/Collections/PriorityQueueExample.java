package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() { // kendimiz sıralama yöntemi tanımladık.
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        q.add("Mustafa");
        q.add("Çetindağ");
        q.add("Ahmet");
        q.add("Damla");

        //System.out.println(q.poll());
        //System.out.println(q.element());

        for(String s:q){
            System.out.println(s);
        }

        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
