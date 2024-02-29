package Array;

/*
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
</p>
* rotateLeft3([1, 2, 3]) → [2, 3, 1]
* rotateLeft3([5, 11, 9]) → [11, 9, 5]
* rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
  
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[(i+1)%nums.length];
          }
        return arr;
      }
      
    
}
