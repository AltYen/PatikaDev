package BasicOfJava.Example;

import java.util.Scanner;

public class PalindromeWords {
    static void isPalindrome(String str){
        String reverse="";

        for(int i = str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Kelime : " + str);
        System.out.println("Kelimenin Tersi : " + reverse);
        if(str.equals(reverse))
            System.out.println(str + " kelimesi palindromdur.");
        else
            System.out.println(str + " kelimesi palindrom değildir.");

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str;

        System.out.print("Kelime : ");
        str = inp.nextLine();

        isPalindrome(str);
    }
}
