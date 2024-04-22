package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 7, 2, 3, 5, 3};

        List<Integer> result = findDuplicate(nums);

        for(Integer in : result){
            System.out.print(in + " ");
        }
    }

    private static List<Integer> findDuplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int j = nums[i] - 1;

            if (nums[i] != nums[j]) {
                swap(nums, i, j);
            } else {
                i++;
            }

        }

        HashSet<Integer> result = new HashSet<>();

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                result.add(nums[k]);
            }
        }
        return new ArrayList<>(result);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
