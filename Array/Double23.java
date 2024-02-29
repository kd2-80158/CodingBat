package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

* double23([2, 2]) → true
* double23([3, 3]) → true
* double23([2, 3]) → false
 */

public class Double23 {

    public boolean double23(int[] nums) {
  
        if(nums.length<2)
          return false;
        
        for(int i=0;i<nums.length;i++)
        {
           if((i+1<nums.length && nums[i]==2 && nums[i+1]==2) || (i+1<nums.length && nums[i]==3 && nums[i+1]==3))
             return true;
        }
        return false;
      }
    
}
