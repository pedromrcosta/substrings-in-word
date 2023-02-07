package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.getSubstrings("asdf");
    }

    /**
     * return the number of possible substrings in word
     * */
    public int getSubstrings(String word) {

        List<String> substringList = new ArrayList<>();
        int wordSize = word.length();
        int substringSize = 1;

        // asdf = a,s,d,f, as, sd, df, asd, sdf, asdf

        while(substringSize < wordSize) {
            for (int i = 0; i < wordSize; i++) {
                if (i + substringSize > wordSize) {
                    break;
                }
                substringList.add(word.substring(i, i + substringSize));
            }
            substringSize += 1;
        }

        substringList.add(word);
        substringList.forEach(System.out::println);

        return substringList.size();
    }
}