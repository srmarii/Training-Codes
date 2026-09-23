public class SegundoMaior {
    public int segundoMaiorNum(int[] nums){
        int tam = nums.length, maior = nums[0], segMaior = -1;


        for(int i =0; i<tam; i++){
            if(nums[i] > maior){
                segMaior = maior;
                maior = nums[i];
            }
        }

        return segMaior;
    }

    public static void main(String[] args) {
        SegundoMaior sm = new SegundoMaior();
    
        int[] nums = {1, 2, 3, 5, 6, 3, 5, 2, 100, 101};

        System.out.println(sm.segundoMaiorNum(nums));

    }
}
 