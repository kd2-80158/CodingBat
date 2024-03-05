package String;

/* 
* Created by Saurabh Chhimwal on 05/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


* countCode("aaacodebbb") → 1
* countCode("codexxcode") → 2
* countCode("cozexxcope") → 2
*/

public class CountCode {

    public int countCode(String str) {
  
        int count=0;
        if(str.length()<4)
          return 0;
        for(int i=0;i<str.length()-3;i++)
        {
          String str1 = "co";
          String str2 = "e";
          if(str1.compareTo(str.substring(i,i+2))==0 && str2.compareTo(str.substring(i+3,i+4))==0)
          {
            count++;
          }
        }
       
       
        return count;
      }
    
}
