import java.util.Arrays;

public class TwoSum {
    //Dado um array e um alvo, retorne os dois índices que somam o alvo
    public int[] returnTwoSum(int[] vetor, int target){
        int tam = vetor.length, soma;
        int[] twoNums = new int[2];

        for(int i = 0; i<tam; i++){
            for(int j = 0; j<tam; j++){
                if(j!=i){
                    soma = vetor[j] + vetor[i];
                    if(soma == target){
                        twoNums[0] = vetor[j];
                        twoNums[1] = vetor[i];
                    }
                }
            }
        }


        return twoNums;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] vetor = {1, 2, 3, 4, 5};
        int target = 5;

        int[] resultado = ts.returnTwoSum(vetor, target);

        System.out.println(Arrays.toString(resultado));
    }
}
