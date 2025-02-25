package collections;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        
        /*
             *                   HashSet Methods:-
             * 
             * 1.To create an HashSet
             *      HashSet<Integer> set=new HashSet<>();
             * 
             * 2.set.add(value);
             *           add a new item into the HashSet.No duplicates
             *          
             * 
             * 4.set.remove(value);
             *          removes value
             * 
             * 5.set.contains(object);
             *          used to check if said object is present in the set.Returns true or false
             * 
             * 6.Iterator:-
             *               for (Integer it : set) {
                                System.out.print(it+" ");
                            }
             */

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Trying to add a duplicate (HashSet does not allow duplicates)
        set.add(20);

        System.out.println(set);

        System.out.println(set.contains(30));
        System.out.println(set.contains(50));

        for (Integer it : set) {
            System.out.print(it+" ");
        }

        set.remove(20);
        System.out.println(set);

    }
}
