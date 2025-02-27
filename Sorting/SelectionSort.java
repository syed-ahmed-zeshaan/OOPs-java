package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int minIndex=-1;
        for(int i=0;i<arr.length;i++){
            minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;}}
                System.out.println(Arrays.toString(arr));
    }
}
