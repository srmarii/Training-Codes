// add([7], [4]) should return [1,1] (7 + 4 = 11)
// add([9,9,5], [1,0]) should return [1,0,0,5] (995 + 10 = 1005)

// https://gist.github.tools.sap/I860668/1d631abfc7a2645d5e6cd6ffa43a7a5f


/*
int n = 157;
n % 10  // = 7  → pega o último dígito
n / 10  // = 15 → remove o último dígito
*/

public class SummingDigitArrays {
    public int[] summingDigits(int[] vetor1, int[] vetor2){
        int tam2 = vetor2.length, tam1 = vetor1.length, aux=0;
        int[] soma = new int[tam1];

        for(int i =tam2-1; i>0; i--){
            aux = vetor1[i] + vetor2[i] + aux;

            // 12
            if(aux > 10){
                //2
                soma[i] = aux % 10;
                //1
                aux = aux / 10;
            } else{
                soma[i] = aux;
                aux =0;
            }
            
        }

        return soma;
    }

    public static void main(String[] args) {
        SummingDigitArrays t = new SummingDigitArrays();

        int[] vetor1 = {1, 2, 6};
        int[] vetor2 = {4, 5, 6};

        int[] novoVet = t.summingDigits(vetor1, vetor2);

        for(int i =0; i<3; i++){
            System.out.println(novoVet[i]);
        }

    }
}
