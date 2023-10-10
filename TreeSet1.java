import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(-1);
        set.add(57);
        set.add(0);
        set.add(75);
        set.add(45);

        System.out.println("Lowest value : "+ set.pollFirst());  // for lowest value
        System.out.println("Highest Value :" + set.pollLast());  // for highest value
        System.out.println(set);


    }
    
}
