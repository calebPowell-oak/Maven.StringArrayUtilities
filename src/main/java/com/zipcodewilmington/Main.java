package com.zipcodewilmington;

public class Main {
    public static void main(String[] args) {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] x = StringArrayUtils.removeValue(array, "bba");

//        array = StringArrayUtils.removeConsecutiveDuplicates(array);
        for (String word :
                x) {
//            System.out.println(word);
        }
    }
}
