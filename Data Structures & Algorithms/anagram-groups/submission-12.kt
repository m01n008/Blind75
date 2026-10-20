class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val hashMap = HashMap<String,MutableList<String>>()
        for (s in strs) {
            val count = IntArray(26){0}		  
            for (ch in s) {
                count[ch - 'a']++
            }
            val key = count.joinToString(separator = "#")
            hashMap.getOrPut(key){mutableListOf()}.add(s) 
        }	
        return hashMap.values.toList()
    }


}
