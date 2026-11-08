package study;
/*
DigitSum
Dado um número inteiro, retorne a soma dos seus dígitos.
Input:  1234  → Output: 10  (1+2+3+4)
Input:  9901  → Output: 19  (9+9+0+1)
*/
public class DigitSum {

    public int whatIsTheSum(int num){
        int sum = 0, assistant;

        while(num > 0){
            assistant = num % 10;
            sum += assistant;

            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        DigitSum ds = new DigitSum();
        System.out.println(ds.whatIsTheSum(9901));
    }
    
}
