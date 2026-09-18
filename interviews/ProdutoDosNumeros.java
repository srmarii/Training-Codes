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

public class ProdutoDosNumeros {
    public static void main(String[] args) {
      ProdutoDosNumeros produtoDosNumeros = new ProdutoDosNumeros();
      int nums[] = {1,2,3,4}; // [0, 12, 0, 0]
       // {0, 0, 1, 2} [0, 0, 0, 0]
      System.out.println(Arrays.toString(produtoDosNumeros.retornaOProduto(nums)));
    }

    public int[] retornaOProduto(int nums[]){
      int todos = 1, aux;
      int numsMulti[] = new int[nums.length];
      boolean temZero = false;

      for(int i = 0; i< nums.length; i++){
        if(nums[i] != 0){
          todos *= nums[i];
        } else{
          temZero = true;
        }
      }

      for(int j = 0; j< nums.length; j++){
        if(nums[j] != 0 && temZero){
          aux = 0;
        } else if(nums[j] == 0){
          aux = todos;
        } else {
          aux = todos / nums[j];
        }
        numsMulti[j] = aux;
      }

      return numsMulti;
    }
}