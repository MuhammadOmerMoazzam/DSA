package pkg2023f.bse.pkg084.lab06.task3;
import java.util.Arrays;

public class BSE084Lab06Task3 {
    public static void main(String[] args) {
        int[] arr = {-1,-3,1,4,-2};  
         int smallestMissingPositive = smallestPositiveIntegerMissing(arr);
        System.out.println("The smallest missing positive integer is: " 
                + smallestMissingPositive);
    }
    public static int smallestPositiveIntegerMissing(int[] arr) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int result = 1;

        while (low <= high) {
            int mid =(low + high) / 2;
            // ignoring negative numbers and zeros
            if (arr[mid] <= 0) 
                low = mid + 1;
            else if (arr[mid] == result) { 
                result++;
                low = mid + 1;
            } else if (arr[mid] > result) 
                high = mid - 1; 
        }
        return result;
    }
}
