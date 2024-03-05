package String;

/* 
* Created by Saurabh Chhimwal on 04/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>



Given a string, return a string where for every char in the original, there are two chars.


* doubleChar("The") → "TThhee"
* doubleChar("AAbb") → "AAAAbbbb"
* doubleChar("Hi-There") → "HHii--TThheerree"
*/

public class DoubleChar {
    public String doubleChar(String str) {
  
        String newString = "";
        
        for(int i=0;i<str.length();i++)
        {
          newString=newString+str.substring(i,i+1)+str.substring(i,i+1);
        }
        return newString;
      }
      
}
