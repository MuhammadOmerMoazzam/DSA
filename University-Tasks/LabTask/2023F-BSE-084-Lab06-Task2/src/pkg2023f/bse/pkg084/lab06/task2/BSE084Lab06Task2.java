package pkg2023f.bse.pkg084.lab06.task2;
import java.util.Arrays;

public class BSE084Lab06Task2 {
    public static void main(String[] args) {
       int[] arr = {1,2,3,5,7,8};
       int value = 5;
       System.out.println("given array = "+Arrays.toString(arr));
       System.out.println("value to find = "+value);
       System.out.println("searched index = "+Arrays.binarySearch(arr, value));
    }
}
