package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer>  liste = new ArrayList<>();
        List<Integer>  liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(1); // kendini tekrar eden değerleri tutar.
        liste.add(1);
        liste.add(1);
        liste.add(5);

        /*
        System.out.println(liste.contains(10));
        liste.remove(1);
        System.out.println(liste);

         */

        /*
        liste.add(2,15);
        liste.set(2,null);
        System.out.println(liste);

         */

        /*
        System.out.println(liste.get(3));
        System.out.println(liste.indexOf(1));
        System.out.println(liste.lastIndexOf(1));

        System.out.println(liste);
        System.out.println(liste.size());
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Integer e:liste){
            System.out.println(e);
        }
         */

        List<String> list = new ArrayList<>();
        list.add("Ankara");
        list.add("İstanbul");
        list.add("Amasya");
        list.add("Bolu");
        list.add("Siirt");

        list.clear();
        System.out.println(list);

        /*
        Object[] objectArr = list.toArray();
        String[] str = list.toArray(new String[0]);
        System.out.println(str[0]);
         */

        /*
        List<String> list2= list.subList(2,5); // son indix dahil edilmez
        System.out.println(list2);

         */

        /*
        List<String> list2= new ArrayList<>();
        list2.add("İzmir");
        // list2.addAll(list); // var olanların üzerine ekleme yapar.
        list2.addAll(0,list); // hangi indexten itibaren eklenecek
        System.out.println(list2);

         */

    }
}
