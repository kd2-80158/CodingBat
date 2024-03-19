package Array;

/* 
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


* centeredAverage([1, 2, 3, 4, 100]) → 3
* centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
* centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    
        // Find the maximum and minimum values in the array
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }
    
        // Subtract the maximum and minimum values from the sum
        sum -= max + min;
    
        // Calculate the number of elements excluding max and min
        int count = nums.length - 2;
    
        // Calculate the centered average
        int avg = sum / count;
    
        return avg;
    }
    
}
