package study;

import java.util.ArrayList;
import java.util.Collections;

/*
SummingDigitArrays
add([7], [4]) should return [1,1] (7 + 4 = 11)
add([9,9,5], [1,0]) should return [1,0,0,5] (995 + 10 = 1005)
- o primeiro array sempre vai ser maior
*/

public class SummingDigitsArrays2 {
     public ArrayList<Integer> returnTheSum(int num1[], int num2[]){
        int tam1 = num1.length, tam2 = num2.length, proximo = 0, aux;
        ArrayList<Integer> retorno = new ArrayList<>();
        
        for(int i = tam1 -1, j = tam2 -1; 
            i>=0; 
            i--, j--){

            if(j>=0){
                aux = num1[i] + num2[j] + proximo;
            } else{
                aux = num1[i] + proximo;
            }

            if(aux <= 9){
                retorno.add(aux);
                proximo = 0; 
            } else{
                retorno.add(aux % 10);
                proximo = aux / 10;
            }       
        }
        //adiciona o carry (ultimo que sobrou) se este nao for igual a 0
        if(proximo != 0){
            retorno.add(proximo);
        }
        Collections.reverse(retorno);

        return retorno;
    }

    public static void main(String[] args) {
        SummingDigitsArrays2 summingDigitsArrays2 = new SummingDigitsArrays2();
        
        int num1[] = {1,0};
        int num2[] = {7};

        System.out.println(summingDigitsArrays2.returnTheSum(num1, num2));
    }
}
