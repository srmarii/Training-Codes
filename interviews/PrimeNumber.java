/*
Write a program to print the first 100 prime numbers.
- A prime number is a whole number greater than 1 that can only be divided evenly by 1 and itself
*/
public class PrimeNumber {
    public void printPrimes() {
        //o contador number serve pra eu verificar todos numeros em sequencia até que isPrime seja true 100 vezes 
        // number comeca em 2 pois 2 é o menor numero primo
        int count = 0, number = 2;

        while (count < 100) {
            boolean isPrime = true;

            //esse FOR vai dividir o number por todos os numeros (i, começando em 2, porque nao faz sentido dividir por 1) do 2 até o number
            for (int i = 2; i < number; i++) {
                //se for divisivel, isPrime é setado pra false e é dado break no FOR, se nenhum for divisivel, então isPrime = true
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(count + 1 + " - " + number);
                count++;
            }

            number++;
        }
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        pn.printPrimes();
    }
}
