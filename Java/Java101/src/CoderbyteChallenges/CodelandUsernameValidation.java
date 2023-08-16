package CoderbyteChallenges;

import java.util.Scanner;

public class CodelandUsernameValidation {
    public static boolean CodelandUsernameValidation(String str) {

        boolean c1=false,c2=false,c3=true,c4=false;
        if(str.length() >=4 && str.length() <=25)
            c1=true;
        if(Character.isLetter(str.charAt(0)))
            c2=true;
        if(!(str.endsWith("_")))
            c4=true;

        for(int i = 0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '_')
                continue;
            else{
                c3=false;
                break;
            }
        }
        // code goes here
        return c1 && c2 && c3 && c4;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}
