package pkg2023f.bse.pkg084.lab01.task2;

public class BSE084Lab01Task2 {
    public static void main(String[] args) {
        double CGPA = 3.87;
        Double object = Double.valueOf(CGPA);
        
        if (object instanceof Double)
            System.out.println("This is an object of Double.");
    }
}
