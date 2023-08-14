package BasicOfJava;

import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        String str = "patika"; // string methodları static değildir. string charlardan oluşan veri kümesi
        char a = 98,b='a'; // charlar ascii kod olarak tutulur örneğin 98 => b ye karşılık gelir.

        System.out.println(a);
        System.out.println(b);
        System.out.println(str.charAt(1)); // stringteki indexteki karakteri getirme. dizideki 2.indexteki elemanı getirme gibi
        System.out.println(str.codePointAt(1)); // o indexteki karakterin ascii kodunu bulma
        System.out.println(str.codePointBefore(1)); // verilen indexteki bir önce karakterin ascii kodunu bulma

        String patika = "paTika";
        System.out.println(str.compareTo(patika)); // karakterlerin unicodelarını karşılaştırma | eşit ise 0 döner.
        System.out.println(str.compareToIgnoreCase(patika)); // karakterlerin unicodelarını karşılaştırma, büyük küçük harf duyarlılığını kaldırıp test etme | eşit ise 0 döner.

        System.out.println(str.concat(".dev")); // stringin sonuna string ekleme
        System.out.println(str.contains("at")); // verilen değer string içerisinde var mı ? bu örnekte 'at' eki var mı diye kontrol eder.

        System.out.println(str.endsWith("k")); // stringin verilen deger ile bitip bitmediğine bakar.
        System.out.println(str.equals("patiKa")); // 2 string değeri karşılaştırma |büyük küçük duyarlı
        System.out.println(str.equalsIgnoreCase("patika")); // 2 string değeri karşılaştırma |büyük küçük duyarsız

        System.out.println(str.indexOf('z')); // verilen değerin indexini bulma | birden fazla varsa bulduğu ilk indexi döner. | hiç yoksa -1 döner
        System.out.println(str.lastIndexOf(a)); // son bulunan index değerini verir.
        System.out.println(str.isEmpty()); // değerin boş olup olmadığını döner.


        System.out.println(str.length()); // stringin uzunluğu verir.
        System.out.println(str.replace("a","b")); // stringteki tüm a karakterlerini b'ye çevirme işlemi | sadece string veya char alır
        System.out.println(str.replaceFirst("a","b")); // stringteki ilk a karakterlerini b'ye çevirme işlemi
        System.out.println(str.replaceAll("a","b")); // stringteki a karakterlerini b'ye çevirme işlemi | regex kod yapısın destekler
        System.out.println(Arrays.toString(str.split("a"))); // verilen değerdeki karakterleri çıkartıp, onlar olmadan parça oluşturur. |geri dönüşü array şeklinde
        System.out.println(str.startsWith("p")); // başlangıç karakterini sorgulama
        System.out.println(str.substring(2)); // 2. indexten sonraki değerleri alarak yeni bir string oluşturur.
        System.out.println("patika.dev".substring(2,5)); // 2. ve 5. indexteki değerleri alıp yeni bir string oluşturur. 5. index dahil değildir. 2. 3. 4. ü alır.
        System.out.println("ALtAN".toLowerCase()); // büyük karakterleri küçültme
        System.out.println("alTan".toUpperCase()); // küçük karakterleri büyütme
        System.out.println("   Dev    ".trim()); // stringteki en sağdaki ve en soldaki boşluk karakterlerini silme || arada kalan boşlukları silmez

    }
}
