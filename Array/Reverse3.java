package Array;

/*
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
</p>

* reverse3([1, 2, 3]) → [3, 2, 1]
* reverse3([5, 11, 9]) → [9, 11, 5]
* reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class Reverse3 {

    public int[] reverse3(int[] nums) {
  
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          arr[i] = nums[(nums.length-i+2)%nums.length]; 
        }
        return arr;
      }
      
    
}
