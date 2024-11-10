package pkg2023f.bse.pkg084.lab01.task1;

public class BSE084Lab01Task1 {
    public static void main(String[] args) {
        String firstStr = "string literal";
        String secondStr = new String("string literal");
        String thirdStr = "heap";
        String fourthStr = "heap".intern();
        String fifthStr = new String("heap").intern();
       
        // showing string immutability
        System.out.println( "Since secondStr is located at new address" 
            + "\nTherefore, firstStr == secondStr : "+(firstStr == secondStr));
        System.out.println("\nBecause of the intern() method the fourthStr "
            + "and the fifthStr \nare located at the same address as the thirdStr."
            + "\ni.e thirdStr == fourthStr : " + (thirdStr == fourthStr)
            + "\nand thirdStr == fifthStr : " + (thirdStr == fifthStr));
    }
}
