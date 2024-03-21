package Array;

/*
* Created by Saurabh Chhimwal on 20/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given an array of ints, return true if it contains no 1's or it contains no 4's.


* no14([1, 2, 3]) → true
* no14([1, 2, 3, 4]) → false
* no14([2, 3, 4]) → true
*/

public class No14 {

    public boolean no14(int[] nums) {
  
        boolean result1=false;
        boolean result2=false;
        
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==1)
            result1=true;
          if(nums[i]==4)
            result2=true;
        }
             
           return !result1 || !result2;
       }
       
    
}
