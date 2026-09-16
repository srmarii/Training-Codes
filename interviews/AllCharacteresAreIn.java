
/*
write a letter by cutting each character 
two strings 

letterText and newspaperPage
return true if each character in letterText is also in newspaperPage and

{
  letterText: "o condor voa",
  newspaperPage: "viajo como condutor",
  result: true
},

{
letterText: "o condor voa",
newspaperPage: "o computador voa",
result: false // missing "n"
},
*/
import java.util.HashMap;

public class AllCharacteresAreIn{
    public boolean checkIfAllCharacteresAreIn(String letterText, String newsPaperPage){
        
        //key = each character
        //value = frequency of each character
        HashMap<Character, Integer> letterHash = new HashMap<>();
        HashMap<Character, Integer> newsPaperHash = new HashMap<>();

        Character currentChar;

        for(int i = 0; i< letterText.length(); i++){
            currentChar = letterText.charAt(i);

            letterHash.put(currentChar, letterHash.getOrDefault(currentChar, 0) +1);
        }

        for(int m = 0; m< newsPaperPage.length(); m++){
            currentChar = newsPaperPage.charAt(m);

            newsPaperHash.put(currentChar, newsPaperHash.getOrDefault(currentChar, 0) +1);
        }

        //letterText should be inside the newsPaperPage

        for(int n = 0; n < letterText.length(); n++){
            Character currentLetterChar = letterText.charAt(n);
            int letterTextFrequency = letterHash.get(currentLetterChar);
            int newsPaperFrequency;
        
            if(!newsPaperHash.containsKey(currentLetterChar)){
                return false;
            } else{
                newsPaperFrequency = newsPaperHash.get(currentLetterChar);
            }

            if(!(letterTextFrequency <= newsPaperFrequency)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        AllCharacteresAreIn allCharacteresAreIn = new AllCharacteresAreIn();
        System.out.println(allCharacteresAreIn.checkIfAllCharacteresAreIn("o condor voa", "viajo como condutor")); //true
        System.out.println(allCharacteresAreIn.checkIfAllCharacteresAreIn("o condor voa", "o computador voa")); //false
    }
}