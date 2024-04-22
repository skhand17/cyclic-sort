package easy;

public class FindTheCorruptPair {
    public static void main(String[] args) {
        int [] nums = new int[]{3, 1, 2, 5, 2};

        int[] result = findNumbers(nums);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    public static int[] findNumbers(int[] nums){

        int i = 0;

        while(i < nums.length){
            int j = nums[i] - 1;

            if(nums[i] != nums[j]){
                swap(nums, i, j);
            } else{
                i++;
            }
        }

        for(int k=0; k<nums.length; k++){
            if(nums[k] != k+1){
                return new int[]{nums[k], k+1};
            }
        }
        return new int[]{-1, -1};
    }

    private static void swap(int[] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
