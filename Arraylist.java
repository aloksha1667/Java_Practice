import java.util.ArrayList;
import java.util.Iterator;

class Arraylist{
    public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                list.add("Alok");
                list.add("Alok");
                list.add("Alok");
                list.add("amit");
                list.add("ankita");
                System.out.println(list);   // list get in array
        
                // Traversing list through Iterator
                Iterator<String> itr = list.iterator();
        
                while (itr.hasNext()) {
                    System.out.println(itr.next());   // list get in without array 
                }
            
        
        
    


        // get list without duplicate 
        // hashset not allowed duplicate element


        // Set<String> set = new HashSet<>(list);
        // List<String> get = new ArrayList<>(set);
        // System.out.println("without duplicatev :- " + get);


        

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