package pkg2023f.bse.pkg084.lab01.task3;

public class BSE084Lab01Task3 {
    public static void main(String[] args) {
        String s1 = "Muhammad";
        String s2 = "Omer";
        String s3 = "Moazzam";
        String s4 = "Section-B";
        String s5 = "RollNo-084";
        
        String s = s1 + s2 + s3 + s4 + s5;
        System.out.println("Concatenated sting := " + s);
        System.out.println("Original fourth string = " + s4 
            +"\nAfter operation fourth string = " + s4.toUpperCase());
        System.out.println("s.substring(8) := " + s.substring(8));
    }  
}
