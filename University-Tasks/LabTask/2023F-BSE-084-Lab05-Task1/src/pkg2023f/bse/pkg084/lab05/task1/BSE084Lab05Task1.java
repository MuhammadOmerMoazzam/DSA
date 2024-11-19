package pkg2023f.bse.pkg084.lab05.task1;
import java.util.Arrays;

public class BSE084Lab05Task1 {
    public static void main(String[] args) {
        int[] nums = {4,2,9,6,7};
        System.out.println("Original array: "+Arrays.toString(nums));
        System.out.println("Selection sort algorithm:");
        selectionSort(nums);
        System.out.println("Final sorted array: "+Arrays.toString(nums));
    }
    public static void selectionSort(int[] array){
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
          int min_index = i;
          for (int j = i + 1; j < size; j++) {
            if (array[j] < array[min_index]) {
              min_index = j;
            }
          }
          int temp = array[i];
          array[i] = array[min_index];
          array[min_index] = temp;
          System.out.println("Value: "+array[i] +", Location: " +i);
        }
        System.out.println("Value: "+array[size - 1]+", Location: "+(size - 1));
    }
}