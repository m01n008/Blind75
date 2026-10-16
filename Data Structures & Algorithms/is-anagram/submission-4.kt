class Solution {
    fun isAnagram (s: String, t: String): Boolean {
    val charHashMap = HashMap<Char,Int>()

    if(s.length != t.length ) return false

    for (ch in s) {
        charHashMap[ch] = (charHashMap[ch] ?: 0) + 1
    }
    for (ch in t) {
        charHashMap[ch] = (charHashMap[ch] ?: 0) - 1
    }
	
    for (ch in s) {
         if(charHashMap[ch]!! != 0) return false

    }
  
    return true
}

}
