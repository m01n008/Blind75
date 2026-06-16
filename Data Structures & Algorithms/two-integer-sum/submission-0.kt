class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      /*Brutforce*/
      
      /*loop through ith position in nums array and for ith position, loop
           through all the jth positions in nums array */

       for(i in 0 until nums.size) {
          for (j in i+1 until nums.size) {
            if(nums[i] + nums[j] == target){
              return intArrayOf(i,j);
            }
          }
       }
       return intArrayOf()     

    }
}
