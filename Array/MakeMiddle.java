package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


* makeMiddle([1, 2, 3, 4]) → [2, 3]
* makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
* makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {
  
        int arr[] = new int[2];
        int size = nums.length/2;
        
        arr[0] = nums[size-1];
        arr[1] = nums[size];
        
        return arr;
      }
    
}
