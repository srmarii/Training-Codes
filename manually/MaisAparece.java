import java.util.Arrays;

public class MaisAparece {
    public int maisComum(int[] nums){
        Arrays.sort(nums);
        
        int numMaisComum = -1, contAtual = 1, contMax = 1, tam = nums.length;

        for(int i = 1; i<tam; i++){
            if(nums[i] == nums[i-1]){
                contAtual++;
            } else{
                contAtual = 1;
            }

            if (contAtual > contMax){
                contMax = contAtual;
                numMaisComum = nums[i];
            }
        }

        return numMaisComum;
    }

    public static void main(String[] args) {
        MaisAparece ma = new MaisAparece();

        int[] nums = {2, 2, 2, 4, 5, 5, 4, 4, 4, 7, 9, 9, 9, 2, 4, 3, 4};

        System.out.println(ma.maisComum(nums));
    }
    
}
