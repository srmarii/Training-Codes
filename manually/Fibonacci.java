import java.util.Arrays;

public class Fibonacci {

    // usuario dar a quantidade de numeros que quer 
    public int[] criaFibonacci(int x){
        int[] vetor = new int[x];
        
        if (x >= 1) vetor[0] = 0;
        if (x >= 2) vetor[1] = 1;

        for(int i = 2; i<x; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }

        return vetor;
    }


    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        int x = 3;
        int[] resultado = f.criaFibonacci(x);

        System.out.println(Arrays.toString(resultado));
    }
}
