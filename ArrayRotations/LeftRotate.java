package ArrayRotations;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
       System.out.println(Arrays.toString(nums));
       rotate(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotate(int[] nums) {
        int n=nums.length;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
    }
}
