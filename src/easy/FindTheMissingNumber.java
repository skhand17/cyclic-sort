package easy;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 0, 3, 1};

        int missingNumber = findMissing(nums);
        System.out.println(missingNumber);
    }

    public static int findMissing(int[] nums) {

        int currentsum = 0;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];
        }

        for (int i = 0; i <= nums.length; i++) {
            actualSum += i;
        }

        return  actualSum - currentsum;
    }


}
