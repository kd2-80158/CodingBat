package String;

/* 
* Created by Saurabh Chhimwal on 10/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


A sandwich is two pieces of bread with something in between. Return the string that is between 
the first and last appearance of "bread" in the given string, or return the empty string "" if 
there are not two pieces of bread.


* getSandwich("breadjambread") → "jam"
* getSandwich("xxbreadjambreadyy") → "jam"
* getSandwich("xxbreadyy") → ""
*/

public class GetSandwich {

    public String getSandwich(String str) {
  
        int firstIndex = str.indexOf("bread");
        int lastIndex  = str.lastIndexOf("bread");
        
        if(firstIndex==lastIndex)
          return "";
        else
          return str.substring(firstIndex+5,lastIndex);
        
      }
      
    
}
