class Solution {
   
    fun isAnagram(s: String, t: String): Boolean {
    
          if (s.length != t.length) return false
          val freq = Array(26){0}
            
            for (ch in s) {
                freq[ch - 'a']++    
            }
            for (ch in t) {
                freq[ch - 'a']--
                if (freq[ch - 'a'] < 0) return false
            }


            return true
       

    }
}
