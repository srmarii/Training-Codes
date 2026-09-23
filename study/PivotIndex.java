package study;

/* 
Find Pivot Index
The goal is to find the index of an array where the sum of the numbers to its left equals the sum of the numbers to its right. 

What the problem asks:
Given an integer array nums, return the leftmost pivot index such that:

The sum of all elements strictly to the left of the index equals
The sum of all elements strictly to the right of the index.

If no such index exists, return -1.

For example:
Input:  [1, 7, 3, 6, 5, 6]
sumLeft = 28 

28 == 28 - sumRight - current


Output: 3
Left sum  = 1 + 7 + 3 = 11
Right sum = 5 + 6 = 11
*/

public class PivotIndex {

    //[1,2,4,3]
    public int findPivotIndex(int nums[]){
        int sumLeft=0, sumRight=0, calculation;

        //sumLeft = 10
        for(int n: nums){
            sumLeft += n;
        }

        for(int i = 0; i<nums.length; i++){
            //calculation = 10 - 1 = 9
            //calculation = 9 - 2 = 7 
            //calculation = 7 - 4 = 3
            calculation = sumLeft - nums[i];
            //0 == 9
            //1 == 7
            //3 == 3
            if(sumRight == calculation){
                return i;
            }
            //sumRight = 1
            //sumRight = 1 + 2 = 3
            sumRight += nums[i];

            //sumLeft = 10 - 1 = 9
            //sumLeft = 9 - 2 = 7
            sumLeft -= nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();

        int nums[] = {1,2,4,3}; //2
        System.out.println(pivotIndex.findPivotIndex(nums));
    }
    
}
