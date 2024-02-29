package Array;

/*
 * Created by Saurabh Chhimwal on 29/02/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
<p>

Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


* plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
* plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
* plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */

public class PlusTwo {

    public int[] plusTwo(int[] a, int[] b) {
  
        int arr[] = new int[a.length+b.length];
        
        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];
        
        return arr;
      }
    
}
