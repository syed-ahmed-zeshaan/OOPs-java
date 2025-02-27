package ArrayRotations;

import java.util.Arrays;

public class LeftRotateD {
     public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       int k = 3;
       
       
        rotate2(nums,nums.length,k);
        System.out.println(Arrays.toString(nums));
    }


    public static void rotate(int[] nums, int d) {
        int n=nums.length;
        if(n==0 || n==1)return;
        d=d%n;
        int [] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        for(int i=d;i<n;i++){
            nums[i-d]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<d;i++){
        nums[i+n-d]=temp[i];
        }

        }

        public static void rotate2(int[] arr,int n,int d){
            d=d%n;
            reverse(arr, 0, d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
        }
    
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        
    }}


    

