package Array;

/* 
* Created by Saurabh Chhimwal on 18/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Given an int array of any length, return a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.


* frontPiece([1, 2, 3]) → [1, 2]
* frontPiece([1, 2]) → [1, 2]
* frontPiece([1]) → [1]
*/

public class FrontPiece {

    public int[] frontPiece(int[] nums) {
  
        int result[] = new int[2];
        if(nums.length<2)
          return nums;
        
        for(int i=0;i<2;i++)
           result[i] +=nums[i];
        
        return result;
      }
      
    
}
