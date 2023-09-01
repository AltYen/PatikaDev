package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //Vector eski kalmış yapılardır. ArrayList'e göre daha yavaştır.
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2,"Bolu");
        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
