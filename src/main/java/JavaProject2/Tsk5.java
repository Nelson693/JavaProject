package JavaProject2;

import java.util.Arrays;

public class Tsk5 {

    /*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
        public static void main(String[] args) {
            String string1 = "listen";
            String string2 = "silent";

            boolean isAnagrams = true;


            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted strings
            Arrays.equals(charArray1, charArray2);



            System.out.println(isAnagrams ? "Anagrams" : "not Anagrams");


        }

    }

