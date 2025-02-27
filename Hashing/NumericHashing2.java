package Hashing;
import java.util.*;
public class NumericHashing2 {
    public static void main(String[] args) {
        int[] arr={1,3,2,1,3,4,6,5,30,32,30,39,48,95};
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                freq=map.get(arr[i]);
                freq++;
                map.put(arr[i],freq);
            }
        }

        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
}
