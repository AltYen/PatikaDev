package BasicOfJava.Example;

import java.util.Scanner;

public class FindNumbersInString {
    static void findNumbers(String str){
        int sum = 0,count=0;
        String stringNumber="";
        for (int i = 0; i < str.length() ; i++) {
            if(count>1){ // zaten alt döngüde hesaplanan sayi adımlarını tekrar hesaplamayıp atlamak için kullanılan kontrol.
                count--;
                continue;
            }
            if(Character.isDigit(str.charAt(i))){
                for (int j = i;j<str.length();j++){
                    if(Character.isDigit(str.charAt(j))){
                        count++; // burada count kullanmamın sebebi o noktadan sonra kaç karakter ilerlediğinin bilgisini tutmak ve üst döngüye girdiğinde o adımlari atlayabilmek.
                        stringNumber+=str.charAt(j);
                    }else
                        break;
                }
                sum+= Integer.parseInt(stringNumber);
                stringNumber="";
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        /*
        girilen stringteki sayıları bulan ve bu sayıları toplayan algoritma
        Eğer rakamlar yan yana ise sayı gibi alınır örneğin  string "75a 1" ise sonuç 76 olmalı. 75 bir bütün olarak kabul edildi.
        Örnek Senaryolar
            "One12 12" => 24
            75Patika2, 4 => 81
         */
        Scanner inp = new Scanner(System.in);
        String str;

        System.out.print("Kelime : ");
        str = inp.nextLine();

        findNumbers(str);
    }
}
