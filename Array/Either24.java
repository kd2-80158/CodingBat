package Array;

/*
* Created by Saurabh Chhimwal on 20/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next 
to a 4, but not both.


* either24([1, 2, 2]) → true
* either24([4, 4, 1]) → true
* either24([4, 4, 1, 2, 2]) → false
*/

public class Either24 {

    public boolean either24(int[] nums) {
  
        boolean isTrue=false;
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
          if(nums[i]==2 && nums[i+1]==2 || nums[i]==4 && nums[i+1]==4){
            isTrue=true;
            count++;}
          if(count>1 &&isTrue)
            return false;
          
        }
        return isTrue;
        
      }
      
    
}
