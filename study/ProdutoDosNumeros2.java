package study;

import java.util.Arrays;

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

public class ProdutoDosNumeros2 {
    public static void main(String[] args) {
        ProdutoDosNumeros2 produtoDosNumeros = new ProdutoDosNumeros2();
        int numsCaso1[] = {1,2,3,4}; // [24,12,8,6]
        int numsCaso2[] = {1,2,3,0}; // [0,0,0,6]
        int numsCaso3[] = {0,0,1,2}; // [0,0,0,0]

        System.out.println(Arrays.toString(produtoDosNumeros.retornaOProduto(numsCaso1)));
        System.out.println(Arrays.toString(produtoDosNumeros.retornaOProduto(numsCaso2)));
        System.out.println(Arrays.toString(produtoDosNumeros.retornaOProduto(numsCaso3)));
    }

    public int[] retornaOProduto(int nums[]){
        int produtoTodos = 1, produtoIndividual[] = new int[nums.length], contZero = 0;

        for(int num: nums){
            if(num == 0){
                contZero++;
            } else{
                produtoTodos*= num;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(contZero == 0){
                produtoIndividual[i] = produtoTodos/nums[i];
            } else if((contZero == 1 && nums[i] != 0) || contZero > 1){
                produtoIndividual[i] = 0;
            } else if(contZero == 1 && nums[i] == 0){
                produtoIndividual[i] = produtoTodos;
            }
        }

        return produtoIndividual;
    }
}
