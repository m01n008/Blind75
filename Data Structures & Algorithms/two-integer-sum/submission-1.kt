class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      /*Optimized*/
      
       val hashMap = HashMap<Int,Int>();
       var j = 0
       for (i in 0 until nums.size) {
           val difference = target - nums[i]

           if (hashMap.get(difference) == null) {
            hashMap.put(nums[i],i)
           
           } else {
           return intArrayOf(hashMap.get(difference)!!,i)
          }

        }

       return intArrayOf()     

    }
}
