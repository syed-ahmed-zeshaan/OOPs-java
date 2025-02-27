package Hashing;
import java.util.*;
public class NumericHashing {
    public static void main(String[] args){
        int[] arr={1,3,2,1,3,4,6,5};
        HashSet<Integer> set=new HashSet<>();

        //precomputer
        int[] hash=new int[7];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]=hash[arr[i]]+1;
            set.add(arr[i]);
        }
        for(Integer it:set){
            System.out.println(it+" "+hash[it]);
        }
    }
}
