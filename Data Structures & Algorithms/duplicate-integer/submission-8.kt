class Solution {
    fun hasDuplicate(nums: IntArray): Boolean { 
        val countHashMap = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            countHashMap[nums[i]] = countHashMap[nums[i]] ?: 1
            if (countHashMap[nums[i]]!! > 1) {
               return true 
            }
            countHashMap[nums[i]] = (countHashMap[nums[i]] ?: 0) + 1
                      
        }
    
        return false
    }


}
