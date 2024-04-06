import java.util.HashMap;
import java.util.Map;
/**
 * Created by Saurabh Chhimwal on 06/04/2024.
 * github.com/kd2-80158
 * chhimwalsaurabh@gmail.com
 * <p>
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows: if a string matches 
an earlier string in the array, swap the 2 strings in the array. When a position in the 
array has been swapped, it no longer matches anything. Using a map, this can be solved 
making just one pass over the array. More difficult than it looks.

* allSwap(["ab", "ac"]) → ["ac", "ab"]
* allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
* allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
public class AllSwap {

    public String[] allSwap(String[] strings) {
  
        Map<Character, Integer> map = new HashMap<>(); 
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar)) {
                int index = map.get(firstChar);
                result[i] = strings[index];
                result[index] = strings[i];
                map.remove(firstChar); // Remove the entry from the map after swapping
            } else {
                map.put(firstChar, i);
                result[i] = strings[i];
            }
        }

        return result;
    }
    
}
