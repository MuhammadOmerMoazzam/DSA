package pkg2023f.bse.pkg084.lab06.task4;
import java.util.Arrays;

public class BSE084Lab06Task4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,7};
        int value = 7;
        System.out.println("given array = "+Arrays.toString(arr));
        System.out.println("value to find = "+value);
        System.out.println("searched index = "+binarySearch(arr, value));
    }
    public static int binarySearch(int[] arr, int value){
        int low = 0; 
        int high = arr.length-1;
        
        while (low <= high){
            int mid = (low + high) / 2;
            if (value == arr[mid])
                return mid;
            if (value > arr[mid]){
                low = mid +1;
            } else {
                high = mid-1;
            } 
        }
        return -1;
    }
}
