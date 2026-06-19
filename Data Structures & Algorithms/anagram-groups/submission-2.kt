class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    /*bruteforce
      time complexity: O(m x nlogn)
      space complexity:O(m) */
    val hashMap = HashMap<String,MutableList<String>>()
    
    for (word in strs) {
        val key = word.toCharArray().sorted().joinToString("");   
        if (hashMap[key] == null) { 
           hashMap[key] = mutableListOf()    
        }
        hashMap[key]!!.add(word) 
    }
    return hashMap.values.toList()    

}


}
