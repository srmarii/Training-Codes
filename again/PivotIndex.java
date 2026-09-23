package again;
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


//codigo linear bruno

public class PivotIndex {
    
    public int findingPivot(int nums[]){
        int direita = 0, esquerda = 0, target = -1;

        for(int n : nums){                                                                
            direita += n;                                                               
        }

        for(int i = 0; i<nums.length; i++){
            if(esquerda == (direita - esquerda - nums[i]) ){
                target = i;
            }
            esquerda += nums[i];
        }
 
      return target;
    }

    public static void main(String[] args) {
      PivotIndex t = new PivotIndex();
    
      int nums[] = {1, 7, 3, 6, 5, 6};
      System.out.println(t.findingPivot(nums));
      
    }



}
