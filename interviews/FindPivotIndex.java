/* Find Pivot Index
The goal is to find the index of an array where the sum of the numbers to its left equals the sum of the numbers to its right. 

What the problem asks:
Given an integer array nums, return the leftmost pivot index such that:

The sum of all elements strictly to the left of the index equals
The sum of all elements strictly to the right of the index.

If no such index exists, return -1.

For example:
Input:  [1, 7, 3, 6, 5, 6]
Output: 3
Left sum  = 1 + 7 + 3 = 11
Right sum = 5 + 6 = 11
  */



public class FindPivotIndex {
    
    public int findingPivot(int nums[]){
      int tam = nums.length, target = -1, somaDireta=0, somaEsquerda=0;

      for(int i = 0; i<tam; i++){
        for(int j = i+1; j<tam; j++){
          somaDireta = somaDireta + nums[j];
        }

        for(int m = i-1; m>=0; m--){
          somaEsquerda = somaEsquerda + nums[m];
        }

        if(somaDireta == somaEsquerda){
          target = i;
        }

        somaDireta=0;
        somaEsquerda=0;

      }

      return target;
    }

    public static void main(String[] args) {
      FindPivotIndex t = new FindPivotIndex();
    
      int nums[] = {1,2,4,3};
      System.out.println(t.findingPivot(nums));
      
    }



}
