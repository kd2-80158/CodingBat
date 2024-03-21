package Array;

/*
* Created by Saurabh Chhimwal on 21/03/2024.
* github.com/kd2-80158
* chhimwalsaurabh@gmail.com
<p>

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements 
in the array, at least one of the pair is that value. Return true if the given value is 
everywhere in the array.


* isEverywhere([1, 2, 1, 3], 1) → true
* isEverywhere([1, 2, 1, 3], 2) → false
* isEverywhere([1, 2, 1, 3, 4], 1) → false
*/

public class IsEverywhere {

    public boolean isEverywhere(int[] nums, int val) {
        // Handle edge cases when array length is 0 or 1
        if (nums.length <= 1) {
            return true;  // 'val' cannot be everywhere in an array of length 0 or 1
        }
    
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if the current element or the next element is equal to 'val'
            if (nums[i] != val && nums[i + 1] != val) {
                return false;  // 'val' is not everywhere, return false
            }
        }
    
        return true;  // 'val' is everywhere in the array
    }
    
    //Alternatively this soln also works:
    /*
     * public boolean isEverywhere(int[] nums, int val) {
    // Handle edge cases when array length is 0 or 1
    if (nums.length <= 1) {
        return true;  // 'val' cannot be everywhere in an array of length 0 or 1
    }

    for (int i = 0; i < nums.length - 1; i++) {
        // Check if the current element or the next element is equal to 'val'
        if (nums[i] == val || nums[i + 1] == val) {
            continue;  // Move to the next pair
        } else {
            return false;  // 'val' is not everywhere, return false
        }
    }

    return true;  // 'val' is everywhere in the array
}

     */
    
}
