class Solution {
    fun twoSum (nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    val hashMap = HashMap<Int,Int>()
    for (i in nums.indices) {
        val difference = target - nums[i]
        if (hashMap.containsKey(difference)) {
           if (i > hashMap[difference]!!) {
               result[0] = hashMap[difference]!!
		       result[1] = i
           }
           if (i < hashMap[difference]!!) {
               result[0] = i
		       result[1] = hashMap[difference]!!
           } 
        }
        else {
            hashMap[nums[i]] = i
        }  
    }
    return result 
    }
}

