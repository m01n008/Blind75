class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
     /*Optimized*/

      val freqHashSet = HashSet<Int>()
       
      for(num in nums) {
        if(num in freqHashSet){
          return true
        }
        freqHashSet.add(num)
      }
      return false
    }
}
