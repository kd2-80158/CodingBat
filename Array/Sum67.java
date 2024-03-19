package Array;

/*
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return the sum of the numbers in the array, returning 0 for an empty array.
 Except the number 13 is very unlucky, so it does not count and numbers that come 
 immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
*/

public class Sum67 {

    public int sum67(int[] nums) {
        if (nums.length < 1)
            return 0;
    
        int sum = 0;
        boolean skipMode = false;
    
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 6) {
                skipMode = true;  
            } else if (nums[i] == 7 && skipMode) {
                skipMode = false; 
            } else if (!skipMode) {
                sum += nums[i];  
            }
        }
    
        return sum;
    }
    
    
}
