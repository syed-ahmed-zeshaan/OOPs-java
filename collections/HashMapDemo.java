package collections;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

         /*
             *                   HashMap Methods:-
             * 
             * 1.To create an HashMap
             *      HashMap<Integer,Integer> map=new HashMap<>();
             * 
             * 2.map.get(i);
             *          map.get(i) gets the element at ith key,
             * 
             * 3.map.put(key,value);
             *           add a new key value pair into the HashMap
             *           also used to update an already existing key value pair
             * 
             * 4.map.remove(key);
             *          removes key value pair at that key
             * 
             * 5.map.containsKey(key);
             *          used to check if said key is present in the map.Returns true or false
             * 
             * 6.map.containsValue(value);
             *          used to check if said value is present in the map.Returns true or false
             * 
             * 7.iterator
             *           for(Map.Entry<Integer,Integer> it:map.entrySet()){
                                        System.out.println("key="+it.getKey()+" value="+it.getValue());
                                    }
             * 
             */

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(1,100);
        map.put(2,200);
        map.put(3,300);

        for(Map.Entry<Integer,Integer> it:map.entrySet()){
                System.out.println("key="+it.getKey()+" value="+it.getValue());
        }

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(200));

        for(int i=1;i<4;i++){
            int temp=map.get(i);
            map.put(i,temp+10);
        }

        System.out.println(map);

        map.remove(2);
        
        
    }
}
