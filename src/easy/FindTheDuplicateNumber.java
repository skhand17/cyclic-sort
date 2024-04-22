package easy;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 1, 4, 4};

       int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }

    private static int findDuplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int j = nums[i] - 1;

            if (nums[i] != nums[j]) {
                swap(nums, i, j);
            } else {
                i++;
            }

        }

        for(int k=0; k<nums.length; k++){
            if(nums[k] != k+1){
                return nums[k];
            }
        }
        return 0;

    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
