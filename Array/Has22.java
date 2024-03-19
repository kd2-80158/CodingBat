package Array;

/*
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


* has22([1, 2, 2]) → true
* has22([1, 2, 1, 2]) → false
* has22([2, 1, 2]) → false
*/


public class Has22 {

    public boolean has22(int[] nums) {
  
        for(int i=0;i<nums.length;i++)
        {
          if(i+1<nums.length && nums[i]==2 && nums[i+1]==2)
            return true;
        }
        return false;
      }
      
    
}
