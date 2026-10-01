/*
Subarray Sum Equals K

Dado um array e um valor k, retorne true se existe algum subarray contíguo cuja soma seja igual a k.
Input:  nums = [1, 2, 3, 4, 5], k = 9  → true  (2 + 3 + 4 = 9)
Input:  nums = [1, 2, 3], k = 10       → false
*/
public class SubarraySumEqualsK {
    public boolean existsASubarray(int nums[], int k){
        int sum=0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    return true;
                } else if(sum > k){
                    sum = 0;
                    break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

        int nums[] = {1,2,3,4,5};
        int nums2[] = {1,2,3};

        System.out.println(subarraySumEqualsK.existsASubarray(nums, 9)); //true
        System.out.println(subarraySumEqualsK.existsASubarray(nums2, 10)); //false
    }
}
