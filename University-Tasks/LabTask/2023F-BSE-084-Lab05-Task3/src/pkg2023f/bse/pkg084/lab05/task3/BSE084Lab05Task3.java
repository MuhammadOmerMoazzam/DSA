package pkg2023f.bse.pkg084.lab05.task3;
import java.util.Arrays;

public class BSE084Lab05Task3 {
    public static void main(String[] args) {
        int[] nums = {4,2,9,6,7};
        System.out.println("Original array: "+Arrays.toString(nums));
        System.out.println("Merge sort algorithm:");
        mergeSort(nums, nums.length);
        System.out.println("Final sorted array: "+Arrays.toString(nums));
    }    
    public static void mergeSort(int[] a, int n){
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
        System.out.println(Arrays.toString(a));
    }
    public static void merge(int[] a, int[] l, int[] r, 
            int left, int right){
 
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
