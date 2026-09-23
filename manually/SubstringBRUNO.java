/* # Distinct Substring
You receive a string of N letters (7 ≤ N ≤ 1000).
You need to find the first sequence of 7 distinct characters and return its position.
The string starts at position 0. If the sequence is not found, return -1.

## Examples
Input string:
ABCDEFGHIJ
└─────┘

Output: `0`
---
Input string:

ABCABCDEFGHIJABCDEFGHIJ
   └─────┘

Output: `3`
---
Input string:

AABBCCDDEEFF

Output: `-1`
*/

public class SubstringBRUNO {
    public int findTheSubstring(String entrada){
      int tam = entrada.length(), indice=-1;
      boolean continuar = true;
      String sub= "" + entrada.charAt(0), atual;

      //validacao para manter a substring com 7 caracteres
      while(continuar){
      
         for(int i =1; i< tam; i++){
            atual = "" + entrada.charAt(i);
            if(!sub.contains(atual)){
               sub = sub + atual;
         
               if(sub.length() == 7){
                  continuar = false;
                  //achar a primeira instancia da minha substring dentro da string maior e pegar o indice dela
                  indice = entrada.indexOf(sub);
                  break;
               }

            } else{
               //fazer isso pois se nao ele limpa o sub e inicia apenas no proximo caracter
               sub= atual;
            }
         }

      }
      
      return indice;
    }

    public static void main(String[] args) {
      SubstringBRUNO s = new SubstringBRUNO();

      System.out.println(s.findTheSubstring("ABCDEFGHIJ"));
    }
}
