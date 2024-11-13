package pkg2023f.bse.pkg084.lab04.task3;

public class BSE084Lab04Task3 {
    public static void main(String[] args) {
        String[] elements = {"11", "sos", "SaaS", "not"};
        System.out.println("Checking each string for palindrome:");
        for (String item : elements) {
            String reversed = reverseString(item, item.length() - 1);
            boolean isPalindrome = palindromeCheck(item, reversed);
            System.out.println("String: "+item+ " | "
                    + "Is palindrome? " + isPalindrome);
        }
    }
    public static String reverseString(String s, int index) {
        if (index < 0)
            return "";
            
        return s.charAt(index) + reverseString(s, index - 1);
    }
    public static boolean palindromeCheck(String original, String reversed){
        return original.equalsIgnoreCase(reversed);
    }
}
