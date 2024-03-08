package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.


* repeatEnd("Hello", 3) → "llollollo"
* repeatEnd("Hello", 2) → "lolo"
* repeatEnd("Hello", 1) → "o"
*/
public class RepeatEnd {
    public String repeatEnd(String str, int n) {
  
        String newString = "";
        String finalString ="";
        if(n<1)
          return "";
        else
        {
          newString += str.substring(str.length()-n);
          while(n!=0)
          {
            finalString += newString;
            n--;
          }
        }
        return finalString;
      }
}
