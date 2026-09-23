public class PalindromoString {
    public Boolean isPalindromo(String word){
        String newWord = "";
        int tam = word.length();

        for(int i = tam - 1; i>= 0; i--){
            newWord = newWord + word.charAt(i);
        }

        return word.equalsIgnoreCase(newWord);
    }

    public static void main(String[] args) {
        PalindromoString p = new PalindromoString();

        String word = "arara";

        System.out.println(p.isPalindromo(word));
    }
}
