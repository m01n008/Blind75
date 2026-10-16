class Solution {
    fun hasDuplicate(nums: IntArray): Boolean { 
    val seen = HashSet<Int>()
    for (element in nums) {
      if (element in seen) return true
      seen.add(element)
    }
    return false

    }
}