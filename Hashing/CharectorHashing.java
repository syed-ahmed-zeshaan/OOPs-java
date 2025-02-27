package Hashing;
import java.util.*;
public class CharectorHashing {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.next();

      HashSet<Character> set=new HashSet<>();

      int[] hash=new int[26];
      for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a']+=1;
        set.add(s.charAt(i));
      }

      for(Character it:set){
        System.out.println(it+" "+hash[it-'a']);
      }


    }
}
