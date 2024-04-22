package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllMissingNumber {

    public static void main(String[] args) {
        int [] nums = new int[] {2, 3, 1, 8, 2, 3, 5, 1};

        List<Integer> result = findAllMissingNumbers(nums);

        for(Integer in : result){
            System.out.print(in + " ");
        }

    }

    public static List<Integer> findAllMissingNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;

        while(i < nums.length) {

            int j = nums[i] - 1;

            if(nums[i] != nums[j]) {
                swap(nums, i, j);
            } else {
                i++;
            }

        }
        for(int k=0; k<nums.length; k++){
            if(nums[k] != k+1){
                result.add(k+1);
            }
        }

        return  result;
    }



    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
