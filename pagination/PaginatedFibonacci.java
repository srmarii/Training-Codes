package pagination;

import java.util.ArrayList;

/*
() Paginated Fibonacci
Given a page number and page size, return the Fibonacci numbers on that page (without generating the full list first).
*/
public class PaginatedFibonacci{

    public ArrayList<Integer> returnPaginatedFibonacciNumbers(int pageNumber, int pageSize){
        int firstIndex = (pageNumber - 1) * pageSize;
        int pastNumber = 0, currentNumber = 1, fibonacciNumber=0;
        ArrayList<Integer> fibonacciNumberArray = new ArrayList<>();

        //1,2,3,5,8
        for(int i = 0; i < firstIndex - 2; i++){
            fibonacciNumber = pastNumber + currentNumber;
            pastNumber = currentNumber;
            currentNumber = fibonacciNumber;
        }

        for(int i = 0; i < pageSize; i++){
            fibonacciNumber = pastNumber + currentNumber;
            fibonacciNumberArray.add(fibonacciNumber);

            pastNumber = currentNumber;
            currentNumber = fibonacciNumber;
        }


        return fibonacciNumberArray;
    }

    public static void main(String[] args) {
        PaginatedFibonacci paginatedFibonacci = new PaginatedFibonacci();

        System.out.println(paginatedFibonacci.returnPaginatedFibonacciNumbers(2, 5));
    }

}