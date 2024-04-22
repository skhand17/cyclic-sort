package easy;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = new int[] {2, 6, 4, 3, 1, 5};

        int [] sortedArr = sort(arr);
        for(int i: sortedArr){
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int j = arr[i] - 1;
            if(arr[i] != arr[j]){
                swap(arr, i, j);
            } else {
            i++;
            }
        }
        return arr;
    }


    /*
    *
    * This method is responsible in swapping the numbers at indices i and j
    * */
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
