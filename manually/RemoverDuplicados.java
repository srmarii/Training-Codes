import java.util.Arrays;

public class RemoverDuplicados {
    public int[] removeDuplicados(int[] vetor){
        int tam = vetor.length, k=1;

        for(int i = 1; i<tam; i++){
            
            if(vetor[i] != vetor[i-1]){
                vetor[k] = vetor[i];
                k++;
            }
        }
        
        return vetor;
    }

    public static void main(String[] args) {
        RemoverDuplicados rd = new RemoverDuplicados();

        int[] vetor = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        int[] resultado = rd.removeDuplicados(vetor);

        System.out.println(Arrays.toString(resultado));
    }
}
