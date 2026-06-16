class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
     /*Bruteforce*/
     
      val freqHashMap = HashMap<Int, Int>()
       
      for (num in nums) {
        freqHashMap[num] = 0
      }
      for (num in nums) {
        freqHashMap[num] = freqHashMap[num]!! + 1
        if(freqHashMap[num]!! > 1) return true
      }
      return false
    }
}
