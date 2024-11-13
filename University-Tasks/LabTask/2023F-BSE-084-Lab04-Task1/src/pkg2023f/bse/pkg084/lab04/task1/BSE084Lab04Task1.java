package pkg2023f.bse.pkg084.lab04.task1;

public class BSE084Lab04Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        System.out.println("\t \"Initailly\" " );
        System.out.print("arr1 = ");printElements(arr1);
        System.out.print("\narr2 = ");printElements(arr2);
                
        swapElements(arr1, arr2);
        
        System.out.println("\n\n\t \"After swap\" ");
        System.out.print("arr1 = ");printElements(arr1);
        System.out.print("\narr2 = ");printElements(arr2);
    }  
    public static void swapElements(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
    public static void printElements(int[] arr){
        for (int i: arr)
            System.out.print(i+ " ");
    }
}
