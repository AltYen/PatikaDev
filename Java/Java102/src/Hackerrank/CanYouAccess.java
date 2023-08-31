package Hackerrank;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class CanYouAccess {
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            Inner inner = new Inner();
            o = inner.new Private();
            Inner.Private iPrivate = inner.new Private();
            String str = num + " is " + iPrivate.powerof2(num);
            System.out.println(str);
            //Write your code here

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution
