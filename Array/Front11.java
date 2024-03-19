package Array;

/* 
* Created by Saurabh Chhimwal on 19/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


* front11([1, 2, 3], [7, 9, 8]) → [1, 7]
* front11([1], [2]) → [1, 2]
* front11([1, 7], []) → [1]
*/

public class Front11 {
    public int[] front11(int[] a, int[] b) {
  
        int result[] = new int[2];
        int short1[] = new int[1];
        
        if(a.length<1 && b.length<1)
          return a;
        if(a.length<1){
          short1[0]=b[0];
          return short1;
        }
        if(b.length<1){
          short1[0]=a[0];
          return short1;
        }
        if(a.length>=1 && b.length>=1){
          result[0]=a[0];
          result[1]=b[0];
        }
        return result;
      }
      
}
