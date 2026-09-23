public class TwoDifference {

    //Criar um método que recebe: um array de inteiros e um valor target
    //E retorna true se existir dois números no array cuja diferença seja 
    //exatamente o valor target. Caso contrário, retorna false.

    public boolean returnTwoSum(int[] vetor, int target){
        int tam = vetor.length, dif;

        for(int i = 0; i<tam; i++){
            for(int j = 0; j<tam; j++){
                if(j!=i){
                    dif = Math.abs(vetor[j] - vetor[i]);
                    if(dif == target){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TwoDifference td = new TwoDifference();

        int[] vetor = {1, 2, 3, 4, 5, 5};
        int target = 10;

        System.out.println(td.returnTwoSum(vetor, target));
    }

}
