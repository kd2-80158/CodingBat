package Array;

/*
 * Created by Saurabh Chhimwal on 28/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>
Given an array of ints, return true if the array is length 1 or more, 
and the first element and the last element are equal.
</p>
* sameFirstLast([1, 2, 3]) → false
* sameFirstLast([1, 2, 3, 1]) → true
* sameFirstLast([1, 2, 1]) → true
 */
public class SameFirstLast
{
    public boolean sameFirstLast(int[] nums) {
  
  for(int i=0;i<nums.length;i++)
  {
    if(nums.length>=1 && nums[0]==nums[nums.length-1])
      return true;
  }
  return false;
}
}