package com.zipcodewilmington;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ //
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ //
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ //
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ //
    public static boolean contains(String[] array, String value) {
        for (String element:array
             ) {
            if(element.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ //
    public static String[] reverse(String[] array) {
        String[] flipped = new String[array.length];
        for(int i = 0; i < array.length; i++){
            flipped[array.length - 1 - i] = array[i];
        }
        return flipped;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ //
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < Math.floorDiv(array.length, 2); i++){
            if(array[i] != array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ //
    public static boolean isPangramic(String[] array) {
        String search = "";
        for (String phrase:array) {
            search += phrase;
        }
        String alpha = "qwertyuiopasdfghjklzxcvbnm";
        char[] alphaArr = alpha.toCharArray();
        for (char letter :alphaArr) {
            if (!search.toLowerCase().contains(String.valueOf(letter))){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ //
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String word :array) {
            if (word.equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ //
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> work = new ArrayList<>(Arrays.asList(array));
        for(int i = 0; i < work.size();){
            if(work.get(i).equals(valueToRemove)){
                work.remove(i);
            } else {
                i++;
            }
        }
        return work.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ //
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String last = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(last)){
                array[i] = ".";
            } else {
                last = array[i];
            }
        }
        return StringArrayUtils.removeValue(array, ".");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ //
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> ans = new ArrayList<>();
        ans.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(array[i-1])){
                ans.set(ans.size()-1,ans.get(ans.size()-1)+array[i]);
            } else {
                ans.add(array[i]);
            }
        }
        return ans.toArray(new String[0]);
    }


}
