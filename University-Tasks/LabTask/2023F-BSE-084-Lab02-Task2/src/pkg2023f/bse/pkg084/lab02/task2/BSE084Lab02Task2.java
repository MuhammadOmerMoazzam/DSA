package pkg2023f.bse.pkg084.lab02.task2;
import java.util.ArrayList;
import java.util.Scanner;

public class BSE084Lab02Task2 {
    public static void main(String[] args) {
        // making sentinal loop
        char CH = 'y';
        do {
            Scanner input = new Scanner(System.in);

            ArrayList<String> names = new ArrayList<String>();
            names.add("Muhammad");
            names.add("Omer");
            names.add("Moazzam");
            
            System.out.println("\t\"MENU\"");
            System.out.println("Press \'1\' to display all elements."
                    + "\nPress \'2\' to show the largest element.");
            // taking input
            System.out.print("Enter your choice (1 or 2): ");
            int choice = input.nextInt();

            switch( choice ) {
                case 1:
                    System.out.println("List = " + names); 
                    break;
                case 2:
                    String largest = names.get(0);
                    for (String name : names) {
                        if (name.length() > largest.length()) {
                            largest = name;
                        }
                    }
                    System.out.println("Largest element = "+largest);
                    break;
            }     
            System.out.print("Do you want to continue? (y/n) ");
            CH = input.next().charAt(0);
        } while(CH == 'Y' || CH == 'y');
    }
}
