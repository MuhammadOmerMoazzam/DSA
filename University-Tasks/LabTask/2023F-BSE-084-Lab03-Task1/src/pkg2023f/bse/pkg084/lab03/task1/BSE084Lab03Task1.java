package pkg2023f.bse.pkg084.lab03.task1;
import java.util.Scanner;

public class BSE084Lab03Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide a Number: ");
        int n = input.nextInt();
        descendingElements(n);
    } 
    public static int descendingElements(int n){
        if (n<0)
            return 0;
        
        System.out.println(n);
        return descendingElements(n-1);
    }
}
