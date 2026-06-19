class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    /*Optimized
    Time Complexity: O(m x n)
    Auxiliary Space Complexity: O(m)
    Total Space Complexity: O(m * n)
    */
    val hashMap = HashMap<String,MutableList<String>>()
       
    for (word in strs) {
       val freq = Array(26){0}  
       for (ch in word.toCharArray()) {
           freq[ch - 'a']++
       }
        val key = freq.joinToString("#");   
        if (hashMap[key] == null) { 
           hashMap[key] = mutableListOf()    
        }
        hashMap[key]!!.add(word) 
    }
    return hashMap.values.toList()    

}




}
