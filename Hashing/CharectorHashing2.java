package Hashing;
import java.util.*;
public class CharectorHashing2 {
    public static void main(String[] args){
        System.out.println("Enter a lowercase String");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        HashMap<Character,Integer> map=new HashMap<>();
        int freq=0;
        for(int i=0;i<s.length();i++){
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),1);
                }
                else{
                    freq=map.get(s.charAt(i));
                    freq++;
                    map.put(s.charAt(i),freq);
                }
        }

        for(Map.Entry<Character,Integer> it:map.entrySet()){
                System.out.println(it.getKey()+" "+it.getValue());
        }



    }
}
