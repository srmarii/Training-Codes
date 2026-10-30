package study;

import java.util.Arrays;

public class MissingNumber {
    public int whichIsTheMissingNumber(int nums[]){
        int currentSubtraction; 
        Arrays.sort(nums);

        if(nums[0] != 1){
            return 1; 
        }

        for(int i = 1; i<nums.length; i++){
            currentSubtraction = nums[i] - nums[i-1];

            if(currentSubtraction != 1){
                return i + 1;
            }
        }

        //if any of the cases happen, then it should be the last number (nums size + 1)
        return nums.length + 1;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();

        //3
        int nums1[] = {1, 2, 4, 5, 6};
        System.out.println(mn.whichIsTheMissingNumber(nums1));

        //1
        int nums2[] = {2, 3, 4, 5};
        System.out.println(mn.whichIsTheMissingNumber(nums2));

        //5
        int nums3[] = {1, 2, 3, 4};
        System.out.println(mn.whichIsTheMissingNumber(nums3));
    }
}
