package String;

/* 
* Created by Saurabh Chhimwal on 06/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return true if the given string contains an appearance of "xyz" where the xyz is not directly 
preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


* xyzThere("abcxyz") → true
* xyzThere("abc.xyz") → false
* xyzThere("xyz.abc") → true
*/
public class XyzThere {
    public boolean xyzThere(String str) {
  
        for(int i=0;i<str.length()-2;i++)
        {
          if(str.substring(i,i+3).equals("xyz") && !(i-1>=0 && str.substring(i-1,i).equals(".")))
            return true;
        }
        return false;
      }
      
}
