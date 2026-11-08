package study;
//return the first 100 prime numbers
public class PrimeNumbers {
    public void firstPrimeNumbers(){
        int counter = 0, number = 1;
        boolean isPrime;

        while(counter < 100){
            isPrime = true;
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    isPrime = false; 
                }
            }

            if(isPrime){
                System.out.println(counter + " - " + number);
                counter++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.firstPrimeNumbers();
    }
}
