package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer palindromeCounter = 0;
        String str2;
        ArrayList<String> allSubstrings = new ArrayList<>();
        int length = input.length();
        for(int c = 0 ; c < length ; c++ ){
            for(int i = 1 ; i <= length - c ; i++ ){
                str2 = input.substring(c, c+i);
                allSubstrings.add(str2);
            }
        }
        String[] myArray = allSubstrings.toArray(new String[allSubstrings.size()]);
        for (int j = 0; j < myArray.length; j++) {
            if ((isPalindrome(myArray[j]))==true) {
                palindromeCounter++;
            }
        }
        return palindromeCounter;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
