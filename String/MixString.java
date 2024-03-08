package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


* mixString("abc", "xyz") → "axbycz"
* mixString("Hi", "There") → "HTihere"
* mixString("xxxx", "There") → "xTxhxexre"
*/

public class MixString {

    public String mixString(String a, String b) {
  
        String newString = "";
        int i=0;
        
        if(a.length()==b.length())
        {
          while(i<a.length())
          {
          newString = newString + a.charAt(i)+b.charAt(i);
          i++;
          }
        }
        
        if(a.length()<b.length())
          {
            while(i<a.length())
            {
               newString = newString+ a.charAt(i)+b.charAt(i);
               i++;
            }
            newString = newString+b.substring(i,b.length());
          }
        if(a.length()>b.length())
          {
            while(i<b.length())
            {
               newString = newString+ a.charAt(i)+b.charAt(i);
               i++;
            }
            newString = newString+a.substring(i,a.length());
          }
          return newString;
      }
//Alternative method:

 /*   String newString = "";
   int aLen = a.length();
   int bLen = b.length();
   int maxLen = Math.max(aLen,bLen);
  
   for(int i=0;i<maxLen;i++)
   {
     if(i<aLen)
       newString += a.substring(i,i+1);
     if(i<bLen)
       newString += b.substring(i,i+1);
   }
   return newString;
      
    */
}
