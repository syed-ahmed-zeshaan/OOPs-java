package collections;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {

         /*
             *                   LinkedList Methods:-
             * 
             * 1.To create an LinkedList
             *      LinkedList<Integer> list=new LinkedList<>();
             * 
             * 2.list.get(i);
             *          list.get(i) gets the element at ith index,
             * 
             * 3.list.add(element);
             *           add an element at the end of LinkedList
             * 
             * 4.list.add(index,element);
             *           adds the element at the index and right shifts rest of the elementts
             * 
             * 5.list.remove(index);
             *          removes element at that index
             * 
             * 6.list.contains(object);
             *          used to check if something is present in the list.Returns true or false
             */

        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        System.out.println(list.contains(5));
        System.out.println(list.contains(10));

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+10+" ");
        }

        list.remove(5);
        System.out.println(list);

        list.add(3,8);
        System.out.println(list);

    }
}
