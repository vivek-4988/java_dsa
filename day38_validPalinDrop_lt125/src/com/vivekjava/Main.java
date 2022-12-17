package com.vivekjava;

import java.util.Locale;

public class Main {


    //   A phrase is a palindrome if,
    //   after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    //   it reads the same forward and backward. Alphanumeric characters include letters and numbers.

//    static String str = "A man, a plan, a canal: Panama";
    static String str = "race a car";
//    static String str = " ";
//    static String str = "0P";


    public static void main(String[] args) {
        System.out.println(checkPalinDromeTwo(convertString(str)));
    }

    static String convertString(String str){
        str = str.toLowerCase();
        StringBuilder strNew= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))){
                strNew.append(str.charAt(i));
            }
        }
        return strNew.toString();
    }

    static boolean checkPalinDrome(String str) {
        int nLen = str.length();
        if (nLen == 1) {
            return true;
        }

        int j = nLen - 1;
        for (int i = 0; i < j; i++) {
            char first = str.charAt(i);
            char last = str.charAt(j);
            j--;
            if(first !=  last){
                return false;
            }
        }
        return true;
    }

    //another solution
    static boolean checkPalinDromeTwo(String str) {
        int nLen = str.length()-1;

        for (int i = 0; i < str.length()/2; i++) {
            char first = str.charAt(i);
            char last = str.charAt(nLen-i);
            if(first !=  last){
                return false;
            }
        }
        return true;
    }


}
