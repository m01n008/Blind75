class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>(nums.size)
        for (e in nums) {
            if (e in seen) return true
            seen.add(e)
        }
        
    return false
    }

}
