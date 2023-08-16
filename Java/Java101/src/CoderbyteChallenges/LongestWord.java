package CoderbyteChallenges;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String str = "fun&!! time";
        str = str.replaceAll("\\p{P}","");
        String parts[] = str.split(" ");
        String text = parts[0];
        for (int i = 1; i < parts.length; i++) {
            if(parts[i].length()>text.length())
                text=parts[i];
        }
        System.out.println(text);
    }
}
