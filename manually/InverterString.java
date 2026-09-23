public class InverterString{
    public String inverteString(String word){
        String newWord = "";
        int tam = word.length();

        for(int i = tam - 1; i>= 0; i--){
            newWord = newWord + word.charAt(i);
        }
        
        return newWord;
    }
    public static void main(String[] args) {

        InverterString inv = new InverterString();

        String word = "Garrafa termica";
        
        System.out.println(inv.inverteString(word));

        
    }

}