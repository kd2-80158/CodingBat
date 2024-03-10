 package String;

/* 
* Created by Saurabh Chhimwal on 08/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>


Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that 
the number of chars to the left and right of the "xyz" must differ by at most one. 
This problem is harder than it looks.


* xyzMiddle("AAxyzBB") → true
* xyzMiddle("AxyzBB") → true
* xyzMiddle("AxyzBBB") → false
*/

public class XYZMiddle {

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3)
            return false;
    
        int mid = str.length() / 2;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int leftLength = i;
                int rightLength = str.length() - (i + 3);
                if (Math.abs(leftLength - rightLength) <= 1)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        String str = "xttxyzxttt";
        boolean result = xyzMiddle(str);
        System.out.println(result);
    }
    
    
}
