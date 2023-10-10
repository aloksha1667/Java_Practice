import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Arraylist{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Alok");
        list.add("Alok");
        list.add("Alok");
        list.add("amit");
        list.add("ankita");
        System.out.println(list);


        // get list without duplicate 
        // hashset not allowed duplicate element

        Set<String> set = new HashSet<>(list);
        List<String> get = new ArrayList<>(set);
        System.out.println("without duplicatev :- " + get);


        

        // add element in particular index as you want

        //  list.add(1,"sona");


        //  int x = 15;
        //  Integer y = new Integer(17);
        //  Integer z = y.intValue();


        //  list.add(x);
        //  list.add(y);
        //  list.add(z);


        // System.out.println(list);
        
    }
}