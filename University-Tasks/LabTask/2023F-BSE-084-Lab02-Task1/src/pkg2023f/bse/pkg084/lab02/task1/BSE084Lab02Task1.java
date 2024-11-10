package pkg2023f.bse.pkg084.lab02.task1;
import java.util.Vector;

public class BSE084Lab02Task1 {
    public static void main(String[] args) {  
        Vector<Integer> v = new Vector<>();
        for (int i=1; i<=10; i++)
            v.add(i);
        System.out.println("Vector Element := " + v);
        System.out.println("sum = "+ sum(v, v.size()-1));
    }
    
    public static int sum(Vector<Integer> v, int index){
        if ( index < 0)
            return 0;
        
        return v.get(index) + sum(v, index -1);
    }
}
