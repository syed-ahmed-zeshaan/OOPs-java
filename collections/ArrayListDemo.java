package collections;
import java.util.ArrayList;

public class ArrayListDemo {
   public static void main(String[] args) {
            

             /*
             *                   ArrayList Methods:-
             * 
             * 1.To create an ArrayList
             *      ArrayList<Integer> list=new ArrayList<>();
             * 
             * 2.list.get(i);
             *          in arrays, just like "arr[i]" gets the element at ith index, we use list.get(i) to do the same task
             * 
             * 3.list.add(element);
             *           add an element at the end of arraylist
             * 
             * 4.list.add(index,element);
             *           adds the element at the index and right shifts rest of the elementts
             * 
             * 5.list.set(index,element);
             *          replaces nukmber at given index to given number.
             * 
             * 6.list.remove(index);
             *          removes element at that index
             * 
             * 7.list.contains(object);
             *          used to check if something is present in the list.Returns true or false
             */


            ArrayList<Integer> list=new ArrayList<>();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            //To iterate through ArrayList,use a for loop just like you do with arrays
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();

            list.add(3,7);
            System.out.println(list);

            list.set(3,10);
            System.out.println(list);

            /*differenece btw list.add(index,element) and list.set(index,element) is
             * list.add(index,element) adds the element at he iindex and right shifts rest of the elementts
             * So list.add(3,7); to [1, 2, 3, 4, 5, 6] is [1, 2, 3, 7, 4, 5, 6] right shifted
             * list.set(3,10) replaces nukmber at index 3 to 10
             * So list.set(3,10) to [1, 2, 3, 7, 4, 5, 6] is [1, 2, 3, 10, 4, 5, 6]
            */

            list.remove(6);
            System.out.println(list);
            
            System.out.println(list.contains(5));
            System.out.println(list.contains(15));

           

   }
}
