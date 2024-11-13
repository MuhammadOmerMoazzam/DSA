package pkg2023f.bse.pkg084.lab04.task5;
import java.util.ArrayList;
import java.util.Arrays;

public class BSE084Lab04Task5 {
    public static void main(String[] args) {
        int[] list1 = {11, 31, 34, 45};
        int[] list2 = {5, 45, 31, 63};
        int[] mergedArray = mergeAndRemoveDuplicates(list1, list2);
        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeAndRemoveDuplicates(int[] list1, int[] list2){
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int num : list1) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        for (int num : list2) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
