package Array;

/*
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
and set all the other elements to be that value. Return the changed array.


* maxEnd3([1, 2, 3]) → [3, 3, 3]
* maxEnd3([11, 5, 9]) → [11, 11, 11]
* maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
  
        int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
          if(i+1<nums.length && nums[i]>nums[i+2])
            {
              while(i<nums.length)
              {
                arr[i] = nums[0];
                i++;
              }
            }
            else
            {
                while(i<nums.length)
              {
                arr[i] = nums[2];
                i++;
              }
            }
        }
        return arr;
      }
      
    
}
