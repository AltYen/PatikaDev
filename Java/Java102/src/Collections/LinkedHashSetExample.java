package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Normal HashSete göre giren sıra ile çıkan sırayı aynı veriyor
        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();
        lHashSet.add(20);
        lHashSet.add(10);
        lHashSet.add(10);
        lHashSet.add(30);

        Iterator<Integer> itr = lHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
