class Solution {
    fun hasDuplicate(nums: IntArray): Boolean { 
        //val maxElement = findMaxElement(nums)
        val countHashMap = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            countHashMap[nums[i]] = 1
        }
        for (i in nums.indices) {
            if (countHashMap[nums[i]]!! > 1) {
               return true 
            }
            countHashMap[nums[i]] = (countHashMap[nums[i]] ?: 0) + 1
                      
        }
    
        return false
    }


    fun findMaxElement(nums: IntArray): Int {
    var maxElement = 0;
    for (i in 0 until nums.size) {
        if (nums[i] > maxElement ) {
           maxElement = nums[i]   
        }
    }
    return maxElement
    }


}
