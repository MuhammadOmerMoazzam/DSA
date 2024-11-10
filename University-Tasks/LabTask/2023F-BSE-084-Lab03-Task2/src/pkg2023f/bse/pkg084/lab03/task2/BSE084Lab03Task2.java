package pkg2023f.bse.pkg084.lab03.task2;

public class BSE084Lab03Task2 {
    public static void main(String[] args) {
        String myName = "Muhammad Omer Moazzam";
        System.out.println("Actual name: "+myName);
        System.out.println("Reversed: "+reverseString(myName, myName.length()-1));
    }
    public static String reverseString(String name, int index){
        if (index < 0)
            return "";
        
        return name.charAt(index) + reverseString(name, index-1);
    }
}
