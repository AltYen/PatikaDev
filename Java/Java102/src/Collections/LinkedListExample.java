package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //LinkedListler listenin ortasına ekleme ve çıkarmada ArrayListlere göre daha hızlı çalışır LinkedList'te O(1) | ArrayList O(N)
        //Aramada ise ArrayList daha hızlı.
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Mustafa");
        liste.add("Çetindağ");
        liste.add("Java");
        liste.add("102");

        liste.remove("Mustafa"); // bulduğu ilk indixi siler.
        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
