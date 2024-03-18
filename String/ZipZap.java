package String;

/* 
* Created by Saurabh Chhimwal on 10/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Returns true if for every '*' (star) in the string, if there are chars both immediately before and after
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


* zipZap("zipXzap") → "zpXzp"
* zipZap("zopzop") → "zpzp"
* zipZap("zzzopzop") → "zzzpzp"
*/

public class ZipZap {

    public String zipZap(String str) {
        if (str.length() < 3)
            return str;
    
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str = str.substring(0, i + 1) + str.substring(i + 2); 
            }
        }
        return str;
    }
    
    
}
