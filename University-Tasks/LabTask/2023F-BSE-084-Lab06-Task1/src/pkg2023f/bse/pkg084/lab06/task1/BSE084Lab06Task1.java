package pkg2023f.bse.pkg084.lab06.task1;
import java.util.Arrays;

public class BSE084Lab06Task1 {
    public static void main(String[] args) {
       int[] balances = new int[10];
       for (int i=0; i<balances.length; i++) {
           balances[i] = 9998 + i;
       }
        System.out.println("balances = "+Arrays.toString(balances));
        System.out.println("count of accounts having balance less than 10000: "
                +count(balances, balances.length-1));
    }
    public static int count(int[] arr, int n){
        int count = 0;
        if (n < 0)
            return 0;
        if (arr[n] < 10000) {
            count++;
            System.out.println("Account No: "+ n +" (Low Balance)");
        }   
        return count + count(arr, n-1);
    }
}
