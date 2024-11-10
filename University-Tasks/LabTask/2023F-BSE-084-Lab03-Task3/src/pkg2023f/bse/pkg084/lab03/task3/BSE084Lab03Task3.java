package pkg2023f.bse.pkg084.lab03.task3;
import java.util.Scanner;

public class BSE084Lab03Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide a Number: ");
        int n = input.nextInt();
        
        System.out.println("sum = "+ sum(n));
    } 
    public static int sum(int n) {
        if ( n <= 0)
            return 0;
        
        return n + sum(n-1);
    }
}
