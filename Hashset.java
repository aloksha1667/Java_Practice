import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        set.add("Ankita");
        set.add("Alok");
        set.add("Abhi");
        set.add("ravi");
        set.add("komal");
        set.add("Alok");

        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(set);
        set.remove("ravi");
        System.out.println(set);
    }
    
}
