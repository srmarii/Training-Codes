package study;

import java.util.Arrays;

/*
SummingDigitArrays
add([7], [4]) should return [1,1] (7 + 4 = 11)
add([9,9,5], [1,0]) should return [1,0,0,5] (995 + 10 = 1005)
- o primeiro array sempre vai ser maior
*/
public class SummingDigitsArrays{

    public int[] returnTheSum(int num1[], int num2[]){
        int tam1 = num1.length, tam2 = num2.length, proximo = 0, aux;
        int retorno[] = new int[tam1+1];

        for(int i = tam1 -1, j = tam2 -1; 
            i>=0; 
            i--, j--){

            if(j>=0){
                aux = num1[i] + num2[j] + proximo;
            } else{
                aux = num1[i] + proximo;
            }

            if(aux <= 9){
                retorno[i+1] = aux;
                proximo = 0; 
            } else{
                retorno[i+1] = aux % 10;
                proximo = aux / 10;
            }       
        }
        //guardar o carry (ultimo numero que sobrar)
        retorno[0] = proximo;

        return retorno;
    }

    public static void main(String[] args) {
        SummingDigitsArrays summingDigitsArrays = new SummingDigitsArrays();
        
        int num1[] = {1,0};
        int num2[] = {7};

        System.out.println(Arrays.toString(summingDigitsArrays.returnTheSum(num1, num2)));
    }

}