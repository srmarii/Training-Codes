public class SingleNumber {
    public int isSingle(int[] nums){
        boolean single;
        int tam = nums.length;

        for(int i = 0; i< tam; i++){
            single = true;
            for(int j = 0; j <tam; j++){
                if(j != i && nums[i] == nums[j]){
                    single = false;
                    break;
                }
            }

            if(single){
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] nums = {4, 4, 9, 1, 2, 1, 2};

        System.out.println(s.isSingle(nums));
    }
}
