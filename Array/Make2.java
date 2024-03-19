package Array;

/* 
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
the elements from a followed by the elements from b. The arrays may be any length, 
including 0, but there will be 2 or more elements available between the 2 arrays.


* make2([4, 5], [1, 2, 3]) → [4, 5]
* make2([4], [1, 2, 3]) → [4, 1]
* make2([], [1, 2]) → [1, 2]
*/

public class Make2 {

    public int[] make2(int[] a, int[] b) {
  
        int result[] = new int[2];
        int i=0,j=0,k=0;
        
        while(k<2 && i<a.length)
        {
          result[k++]=a[i++];
        }
        while(k<2 && j<b.length)
        {
          result[k++]=b[j++];
        }
        
        return result;
         
      }
      
    
}
