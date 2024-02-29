package Array;

/*
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>
Given an array of ints, return true if 6 appears as either the first or last element in the array. 
The array will be length 1 or more.
</p>
* firstLast6([1, 2, 6]) → true
* firstLast6([6, 1, 2, 3]) → true
* firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6 {

    public boolean firstLast6(int[] nums) {
  
        for(int i=0;i<nums.length;i++)
        {
          int len = nums.length;
          if(nums[0]==6 || nums[len-1]==6)
            return true;
        }
        return false;
      }
    
}
