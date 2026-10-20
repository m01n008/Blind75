class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val hashMap = HashMap<String,MutableList<String>>()
        for (s in strs) {
            val count = IntArray(26){0}
            val sb = StringBuilder()		  
            for (ch in s) {
                count[ch - 'a']++
            }
            sb.append(count.joinToString(separator = "#"))
            hashMap.getOrPut(sb.toString()){mutableListOf()}.add(s) 
        }	
        return hashMap.values.toList()
    }


}
