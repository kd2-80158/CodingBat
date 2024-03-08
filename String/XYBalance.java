package String;

/* 
* Created by Saurabh Chhimwal on 07/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
*/

public class XYBalance {
  
      public boolean xyBalance(String str) {
  
        if(str.length()<1 || str.indexOf('x')==-1)
          return true;
        else if(str.lastIndexOf('x') < str.lastIndexOf('y'))
          return true;
        else 
          return false;
        // return (str.indexOf('x')==-1) || str.lastIndexOf('x') < str.lastIndexOf('y');
          }
          
    
    
}
