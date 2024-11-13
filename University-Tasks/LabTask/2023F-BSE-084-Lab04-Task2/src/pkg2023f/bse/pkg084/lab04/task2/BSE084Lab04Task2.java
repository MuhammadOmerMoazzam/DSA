package pkg2023f.bse.pkg084.lab04.task2;

public class BSE084Lab04Task2 {   
    public static void main(String[] args) {
        String[] list1 = {"Muhammmad" , "Omer"};
        String[] list2 = {"Moazzam"};
        String[] arr = merge(list1, list2);
       
        display("list1", list1); 
        display("list1", list2); 
        display("merged array = ",arr);
    }
    public static String[] merge(String[] list1, String[] list2){
        String[] newArr = new String[list1.length + list2.length];
        for (int i =0; i <list1.length; i++){
            newArr[i] = list1[i];
        }
        for (int i =0; i< list2.length; i++) {
            newArr[list1.length+i] = list2[i];
        }
        return newArr;
    }
    public static void display(String name, String[] arr){
        System.out.print(name +" = [ ");
        for (String i: arr){
            System.out.print(i+", ");
        }
        System.out.println("]");
    }
}
