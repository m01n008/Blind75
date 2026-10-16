class Solution {
    fun isAnagram (s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val freq = IntArray(26)
        
        for (ch in t) {
            freq[ch - 'a']++
        }
        for (ch in s) {
            freq[ch - 'a']--
            if (freq[ch - 'a'] < 0) return false
        }
    
        return true
    }
    

}
