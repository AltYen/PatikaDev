package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap<String,String> country = new HashMap<>();
        Map<String,String> country = new HashMap<>();

        // bir key bir değer alır.
        country.put("TR","Türkiye");
        country.put("GR","Almanya");
        country.put("EN","İngiltere");

        country.replace("GR","Alamanya");

        // sıralama garantisi yok
        for(String countryKey: country.keySet()){
            //System.out.println(countryKey);
            System.out.println(country.get(countryKey));
        }
        System.out.println("##########");
        for(String countryValue: country.values()){
            System.out.println(countryValue);
        }
        System.out.println(country.size());
        country.clear();
        country.remove("EN");
        System.out.println(country.get("EN")); // keyi "EN" olan value'yu getir

    }
}
