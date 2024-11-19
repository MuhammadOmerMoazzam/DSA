package pkg2023f.bse.pkg084.lab05.task2;

public class BSE084Lab05Task2 {
    public static void main(String[] args){
        int[] nums = {4,2,9,6,7};
        System.out.println("Original array:");
        display(nums);
        System.out.println("Bubble sort algorithm:");
        bubbleSort(nums);
        System.out.println("Final sorted array:");
        display(nums);
    }
    public static void bubbleSort(int[] nums){
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    display(nums);
                }
            }
        }
    }
    public static void display(int[] nums) {
        for (int k: nums)
            System.out.print(k +", ");
        System.out.println("");
    }
}

