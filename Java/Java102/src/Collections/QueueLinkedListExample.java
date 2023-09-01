package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        //Polymorphism
        Queue<String> q = new LinkedList<>(); // linkedlist queue gibi davranır
        q.add("Mustafa");
        q.add("Çetindağ");
        q.offer("Patika");

        System.out.println(q.peek());
        //System.out.println(q.poll());
        //System.out.println(q.element());
        System.out.println("######");

        //q.remove("Çetindağ");

        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
