package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given an array of ints, return the sum of the first 2 elements in the array. 
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


* sum2([1, 2, 3]) → 3
* sum2([1, 1]) → 2
* sum2([1, 1, 1, 1]) → 2
 */

public class Sum2 {

    public int sum2(int[] nums) {
  
        int sum=0;
        if(nums.length<1)
          return 0;
        for(int i=0;i<2;i++)
        {
          if(nums.length==1)
          {
            sum=sum+nums[0];
            return sum;
          }
          else
            sum = sum+nums[i];
        }
        return sum;
      }
    
}
