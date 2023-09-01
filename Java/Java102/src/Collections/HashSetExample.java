package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        //collectionslarda boyut vermeye gerek yok, kendi kendine genişleyen bir yapısı var
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);
        hSet.remove(10);
        //hSet.clear();
        //giren sıralama ile çıkan sıralama aynı olacak diye bir garantisi yok.
        for(Integer i: hSet){
            System.out.println(i);
        }

        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.contains(20));

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
