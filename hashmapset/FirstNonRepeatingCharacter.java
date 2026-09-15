package hashmapset;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Dado uma string, retorne o primeiro caractere que aparece exatamente uma vez. Se não existir, retorne '#'.
Input:  "aabbcde"  → Output: 'c'
Input:  "aabb"     → Output: '#'
*/
public class FirstNonRepeatingCharacter {
    public Character whichIsTheCharacter(String palavra){
        Character retorno = '#';
        int tam = palavra.length();

        //chave = caracter
        //valor = frequencia

        //linkedhashmap mantem os itens na ordem de insercao
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for(int i = 0; i<tam; i++){
            Character charAtual = palavra.charAt(i);
            hm.put(charAtual, hm.getOrDefault(charAtual, 0) + 1);
        }

        for(int i = 0; i < tam; i++){
            Character charAtual = palavra.charAt(i);
            if(hm.get(charAtual) == 1){
                return charAtual;
            }
        }

        return retorno;
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter f = new FirstNonRepeatingCharacter();

        System.out.println(f.whichIsTheCharacter("aabbdc"));
    }
}
