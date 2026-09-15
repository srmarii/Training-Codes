package study;

import java.util.HashSet;

/*
Exercise 2 — Longest Substring Without Repeating Characters
Given a string, return the length of the longest substring without repeating characters.

Input:  "abcabcbb"
Output: 3  (substring is "abc")

Input:  "bbbbb"
Output: 1  (substring is "b")

01234567
abcabcbb

b==a 
c==b
a==c
*/
public class LongestSubstring {
    public int returnTheLongestSubstring(String word){

        //key = each character from the word
        HashSet<Character> compareCharacters = new HashSet<>();
        Character currentChar;
        int currentCounter = 0, maximumCounter = 0;

        for(int i = 0; i < word.length(); i++){
            currentChar = word.charAt(i);

            //if it is NOT duplicated
            if(!compareCharacters.contains(currentChar)){
                compareCharacters.add(currentChar);
                currentCounter++;

                if(currentCounter>maximumCounter){
                    maximumCounter = currentCounter;
                }
            } 
            //if it is duplicated
            else {
                currentCounter = 1;
                compareCharacters.clear();
                compareCharacters.add(currentChar);
            }
        }


        return maximumCounter;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.returnTheLongestSubstring("abcabcde"));
    }
}
