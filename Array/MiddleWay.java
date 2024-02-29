package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

* middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
* middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
* middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

public class MiddleWay {

    public int[] middleWay(int[] a, int[] b) {
  
        int arr[] = new int[a.length-1];
        
         arr[0] = a[1];
         arr[1] = b[1];
         
         return arr;
      }
    
}
