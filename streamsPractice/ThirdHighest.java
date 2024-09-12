package streamsPractice;

import java.util.Arrays;

public class ThirdHighest {
    public static int findSecondHigh(int[] nums){
        int n = nums.length-1;
        if(n<2){
            return -1;
        }

        Arrays.sort(nums);

        int max = nums[n], secondHighest=-1;
        for(int i=0; i<n; i++) {
            if(nums[i] != max) {
                secondHighest = nums[i];
            }
        }

        return secondHighest;

    }
    public static void main(String[] args) {
       int[] nums = {4, 4, 3, 2};

       int seconndHigh = findSecondHigh(nums);
       for (int i =0; i<nums.length; i++){
           if(nums[i] == seconndHigh){
               nums[i] = -1;
           }
       }
        int thirdHigh = findSecondHigh(nums);
        System.out.println(thirdHigh);
    }
}
