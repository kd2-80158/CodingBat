package String;

/* 
* Created by Saurabh Chhimwal on 10/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given a string, compute a new string by moving the first char to come after the next two chars,
 so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, 
 so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

* oneTwo("abc") → "bca"
* oneTwo("tca") → "cat"
* oneTwo("tcagdo") → "catdog"
*/


public class OneTwo {

    public String oneTwo(String str) {
  
        String newString = "";
        if(str.length()<3)
          return "";
        else
          {
            for(int i=0;i<str.length()-2;i=i+3)
            {
              newString += str.substring(i+1,i+3)+str.charAt(i);
            }
          }
          return newString;
      }
      
    
}
