package study;

import java.util.Arrays;
import java.util.HashMap;

/*
LessDistance
Receber um array de strings ou inteiros e retornar os dois indices das strings ou inteiros iguais que estão mais proximos
Input: ["banana", "maca", "banana", "laranja", "maca", "uva", "banana"]
Output: [0, 2]
*/
public class LessDistance {

    public int[] whichIsTheLessDistance(String fruits[]){
        int currentDistance, lessDistance = fruits.length - 1;
        int indexes[] = new int[2];

        //key = fruits
        //value = index
        HashMap<String, Integer> fruitsMap = new HashMap<>();

        for(int i = 0; i<fruits.length; i++){
            if(fruitsMap.containsKey(fruits[i])){
                currentDistance = i - fruitsMap.get(fruits[i]);
                if(currentDistance < lessDistance){
                    lessDistance = currentDistance;

                    indexes[0] = fruitsMap.get(fruits[i]);
                    indexes[1] = i;
                }
            } 
            //para nao dar problema dos itens nao se repetirem por ser um hashmap, 
            // eu nao insiro tudo antes no hashmap pra depois analisar, eu vou analisando e inserindo, 
            // dai depois dele analisar ele já descarta a necessidade de ver aquele item novamente, 
            // nao tendo problema o fato dele nao se repetir no hashmap
            fruitsMap.put(fruits[i], i);
        }

        return indexes;
    }

    public static void main(String[] args) {
        LessDistance lessDistance = new LessDistance();

        String fruits[] = {"banana", "maca", "banana", "laranja", "maca", "uva", "banana"};
        System.out.println(Arrays.toString(lessDistance.whichIsTheLessDistance(fruits)));
    }
    
}
