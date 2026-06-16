class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      /*
      1. Get the character frequency of first string
      2. Compare by second string and decrement each character count in the frequency table if it exists.
      3. if any character count is not zero at last, then we know its not an anagram s we will return false else
         if it reaches end of the length and the count for all characters remains 0 at last then we will return true
      */
    
     if(s.length != t.length) return false
     
     val freq = IntArray(256) 
     
     for(ch in s) {
      freq[ch.code]++
     }

     for(ch in t) {
      freq[ch.code]--
      if(freq[ch.code] < 0) return false
     }
     

     return true;



}
}
