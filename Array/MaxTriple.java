package Array;

/* 
* Created by Saurabh Chhimwal on 02/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>



Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


* maxTriple([1, 2, 3]) → 3
* maxTriple([1, 5, 3]) → 5
* maxTriple([5, 2, 3]) → 5
*/

public class MaxTriple {

    public int maxTriple(int[] nums) {
  
        if(nums.length<1)
          return 0;
        
        for(int i=0;i<nums.length;i++)
        {
          int mid = nums.length/2;
          if(nums[i]>nums[mid] && nums[i]>nums[nums.length-1])
            return nums[i];
          if(nums[mid]>nums[nums.length-1])
            return nums[mid];
          else
            return nums[nums.length-1];
        }
        return 0;
      }
    
}
