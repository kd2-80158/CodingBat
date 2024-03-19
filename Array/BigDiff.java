package Array;

/* 
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given an array length 1 or more of ints, return the difference between the largest and 
smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) 
methods return the smaller or larger of two values.


* bigDiff([10, 3, 5, 6]) → 7
* bigDiff([7, 2, 10, 9]) → 8
* bigDiff([2, 10, 7, 2]) → 8
*/

public class BigDiff {

    public int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
    
        int diff = max - min;
        return diff;
    }
    
    
}
