package CoderbyteChallenges;

import java.util.Scanner;

public class QuestionsMarks {
    public static boolean QuestionsMarks(String str) {
        boolean conditionMarkCount = false;
        int markCount = 0;
        for(int i = 0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                for(int j=i+1;j<str.length();j++){
                    if(Character.isDigit(str.charAt(j))){
                        if(Integer.parseInt(""+str.charAt(i)) + Integer.parseInt(""+str.charAt(j)) <= 10){
                            if(markCount>=3)
                                conditionMarkCount=true;
                            else
                                return false;
                        }
                        i=j+1;
                        break;
                    }
                    if(str.charAt(j) == '?')
                        markCount++;
                }
                markCount=0;
            }
        }
        // code goes here
        return conditionMarkCount;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
