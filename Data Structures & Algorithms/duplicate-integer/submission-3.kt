class Solution {
 fun hasDuplicate(nums: IntArray): Boolean {
    /* Optimized: O(n) */
    val seen = HashSet<Int>()
    
    for (e in nums) {
        if (e in seen) return true
        seen.add(e)   
    }
    
    return false

  }
}
