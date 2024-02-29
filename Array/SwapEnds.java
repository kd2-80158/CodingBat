package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>


Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


* swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
* swapEnds([1, 2, 3]) → [3, 2, 1]
* swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

public class SwapEnds {

    public int[] swapEnds(int[] nums) {
  
        int temp=0;
        if(nums.length<1)
          return nums;
        temp=nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        
        return nums;
      }
      
    
}
