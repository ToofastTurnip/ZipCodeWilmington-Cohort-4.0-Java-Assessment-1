package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String firstLetter = str.substring(0, 1);
        return firstLetter.toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = reverse(str);
        return camelCase(reverse);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] arrayFromString = str.toCharArray();
        for (int i = 0; i < arrayFromString.length; i++) {
            char currentCharacterOfIteration = arrayFromString[i];
            if (Character.isUpperCase(currentCharacterOfIteration)) {
                arrayFromString[i] = Character.toLowerCase(currentCharacterOfIteration);
            } else if (Character.isLowerCase(currentCharacterOfIteration)) {
                arrayFromString[i] = Character.toUpperCase(currentCharacterOfIteration);
            }
        }
        return new String(arrayFromString);
    }
}
