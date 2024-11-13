package pkg2023f.bse.pkg084.lab04.task4;

public class BSE084Lab04Task4 {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        countEvenOddInt(integers, integers.length, 0, 0);
    }
    public static void countEvenOddInt(int[] integers, int n, 
            int even, int odd){
        if (n <= 0) 
            System.out.println("Even numbers: " + even + 
                    "\nOdd numbers: " + odd);
        else {
            if (integers[n - 1] % 2 == 0)
                even++;
            else 
                odd++;
            countEvenOddInt(integers, n - 1, even, odd);
        }
    }
}
