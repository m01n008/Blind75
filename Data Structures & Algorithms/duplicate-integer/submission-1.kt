class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
     /*Bruteforce*/

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
