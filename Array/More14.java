package Array;

/*
* Created by Saurabh Chhimwal on 20/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given an array of ints, return true if the number of 1's is greater than the 
number of 4's


* more14([1, 4, 1]) → true
* more14([1, 4, 1, 4]) → false
* more14([1, 1]) → true
*/

public class More14 {

    public boolean more14(int[] nums) {
  
        int one=0;
        int four=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==1)
            one++;
          if(nums[i]==4)
            four++;
        }
        if(one>four)
          return true;
        else
          return false;
      }
      
    
}
