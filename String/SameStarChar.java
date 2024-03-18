package String;

/* 
* Created by Saurabh Chhimwal on 10/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Returns true if for every '*' (star) in the string, if there are chars both immediately before and after
 the star, they are the same.


* sameStarChar("xy*yzz") → true
* sameStarChar("xy*zzz") → false
* sameStarChar("*xa*az") → true
*/

public class SameStarChar {

    public boolean sameStarChar(String str) {

    
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1))
                    return false;
            }
        }
    
        return true;
    }
    
    
}
