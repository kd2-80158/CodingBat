package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.


* biggerTwo([1, 2], [3, 4]) → [3, 4]
* biggerTwo([3, 4], [1, 2]) → [3, 4]
* biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class BiggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
  
        int sum1 = 0;
        int sum2 = 0;
        
        sum1 = sum1+a[0]+a[1];
        sum2 = sum2+b[0]+b[1];
        
        if(sum1==sum2)
          return a;
        
        if(sum1>sum2)
          return a;
        else
          return b;
      }
      
    
}
