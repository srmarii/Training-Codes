package study;

import java.util.HashMap;

/*
ParseInt - Write a function that takes in a string parameter and converts it into an integer, 
but only if it is indeed an integer. Do not use Integer.parseInt() or similar.
*/
public class ParseInt {
    public int returnAnInteger(String numberAsString){
        Character currentChar;
        boolean onlyNumbers = true;
        HashMap<Character, Integer> stringInteger = new HashMap<>();
        int numberAsInteger = 0;

        for(int i = 0; i < numberAsString.length(); i++){
            currentChar = numberAsString.charAt(i);

            if(!Character.isDigit(currentChar)){
                onlyNumbers = false;
            }
        }

        if(onlyNumbers){
            stringInteger.put('0', 0);
            stringInteger.put('1', 1);
            stringInteger.put('2', 2);
            stringInteger.put('3', 3);
            stringInteger.put('4', 4);
            stringInteger.put('5', 5);
            stringInteger.put('6', 6);
            stringInteger.put('7', 7);
            stringInteger.put('8', 8);
            stringInteger.put('9', 9);

            for(int i = 0; i<numberAsString.length(); i++){
                currentChar = numberAsString.charAt(i);

                numberAsInteger = (numberAsInteger * 10) + stringInteger.get(currentChar);
            }

            return numberAsInteger;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ParseInt parseInt = new ParseInt();

        System.out.println(parseInt.returnAnInteger("123"));
    }
}
