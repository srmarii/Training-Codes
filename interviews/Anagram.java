/*
An Anagram is a word or phrase formed by rearranging the letters of a 
different word or phrase, typically using all the original letters exactly once.
 
Write a method that two strings and compare them to checks if the first string 
is a anagram of second string.
*/
 
public class Anagram {
 
  public static void main(String args[]) {
 
      //pass
      String result1 = isAnagram("sap", "pas") ? "Pass": "Fail";
      System.out.println(result1);
      //fail
      String result2 = isAnagram("anagram", "nagaram") ? "Pass": "Fail";
      System.out.println(result2);
      //fail
      String result3 = isAnagram("car", "rat") ? "Fail" : "Pass";
      System.out.println(result3);
      String result4 = isAnagram("", "") ? "Fail" : "Pass";
      System.out.println(result4);
      String result5 = isAnagram("", "house") ? "Fail": "Pass";
      System.out.println(result5);
      String result6 = isAnagram("house", "") ? "Fail": "Pass";
      System.out.println(result6);
  }


  public static boolean isAnagram(String s1, String s2) {
    int tam = s1.length();
    String s1Anagram = "";

    if(s1.isEmpty() || s2.isEmpty() || s1.isBlank() || s2.isBlank()){
      return false;
    } else{ 

      for(int i = tam-1; i>=0; i--){
        s1Anagram = s1Anagram + s1.charAt(i);
      }

        return s1Anagram.equals(s2);
    }
  }
}