package BasicOfJava.Example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        //Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        int right = 5,guessCount = 0,guess;
        int[] wrongList= new int[5];
        boolean isWrong=false;
        //int random = rand.nextInt(100); diğer bir random üretme yöntemi.
        int randomNumber = (int) (Math.random() * 10); // 0-100 arası random sayı üretme, örnek olarak 0-100 istiyorum ancak 100 verdiğim zaman üst sınır dahil olmuyor, o yüzden 101 vermem gerekli.

        do{
            System.out.print(guessCount+1 + ". Tahminin : " );
            guess = inp.nextInt();

            if(guess < 0 || guess >100){
                System.out.println("0-100 Arası Tahminde Bulunun !");
                if(isWrong){
                    right--;
                    System.out.println("çok fazla hatalı giriş yaptınız, Kalan hak : " + right);
                }else{
                    isWrong=true;
                    System.out.println("Bir daha hatalı giriş yaparsanız hakkınız düşülecek");
                }
                continue;
            }

            guessCount++;
            right--;

            if(guess == randomNumber){
                System.out.println("Tebrikler " + guessCount + ". denemede bildiniz. Random Sayı : " + randomNumber);
                break;
            }else{
                wrongList[guessCount-1] = guess;
                System.out.println("Kalan hak: " + right);
                if (right == 0){
                    System.out.println("Kaybettiniz. Random Sayı : " + randomNumber);
                    System.out.println("Tahmin Listeniz : " + Arrays.toString(wrongList));
                }else if(guess<randomNumber){
                    System.out.println("Yukarı");
                }else{
                    System.out.println("Aşağı");
                }
            }
        }while (right>0);

    }
}
