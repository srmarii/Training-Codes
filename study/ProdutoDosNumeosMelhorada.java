package study;
import java.util.*;
/*
Given an integer array nums, return an array answer such that answer[i] is 
equal to the product of all the elements of nums except nums[i].

Example 1:
Input: nums = [1,2,3,4]
{1,0,3,4}
Output: [24,12,8,6]

24 = 2 * 3 * 4
12 = 1 * 3 * 4 
...
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
*/

public class ProdutoDosNumeosMelhorada {
    public static void main(String[] args) {
      ProdutoDosNumeosMelhorada produtoDosNumeosMelhorada = new ProdutoDosNumeosMelhorada();
      
      //sem zero
      int nums1[] = {1,2,3,4}; // [24,12,8,6]
      //com 1 zero
      int nums2[] = {1,2,3,0}; // [0,0,0,6]
      //com + de 1 zero
      int nums3[] = {1,2,0,0}; //[0,0,0,0]

      System.out.println(Arrays.toString(produtoDosNumeosMelhorada.retornaOProduto(nums1)));
      System.out.println(Arrays.toString(produtoDosNumeosMelhorada.retornaOProduto(nums2)));
      System.out.println(Arrays.toString(produtoDosNumeosMelhorada.retornaOProduto(nums3)));
    }

    public int[] retornaOProduto(int nums[]){
      int todos = 1, contZeros = 0, tam = nums.length, numsMulti[] = new int[tam];

      for(int i = 0; i< tam; i++){
        if(nums[i] != 0){
          todos *= nums[i];
        } else{
          contZeros++;
        }
      }

      for(int j = 0; j< tam; j++){
        //se o numero atual nao for um zero e tiver apenas um zero
        //ou se tiver mais que um zero
        if((nums[j] != 0 && contZeros == 1) || contZeros > 1){
          numsMulti[j] = 0;
          //se tiver um zero só
        } else if(nums[j] == 0 && contZeros == 1){
          numsMulti[j] = todos;
          //se não tiver zero
        } else {
          numsMulti[j] = todos / nums[j];
        }
      }

      return numsMulti;
    }
}