class Solution {
     fun twoSum(nums: IntArray, target: Int): IntArray {
            val hashMap = HashMap<Int,Int>()
            
            for (i in 0 until nums.size) {
                val diff = target - nums[i]
                if (hashMap[diff] != null) {
                    return intArrayOf(hashMap[diff]!!, i)
                } else{
                    hashMap[nums[i]] = i      
                  }
            }
                return intArrayOf()
        }
        
}
