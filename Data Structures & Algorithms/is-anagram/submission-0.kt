class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      /*
      1. Get the character frequency of first string
      2. Compare by second string and decrement each character count in the frequency table if it exists.
      3. if any character count is not zero at last, then we know its not an anagram s we will return false else
         if it reaches end of the length and the count for all characters remains 0 at last then we will return true
      */
    
       val freq = Array(256) {0}
       var i = 0
       var charArray = s.toCharArray()
       var result: Boolean = true

       if(s.length != t.length){
       result = false
       }
       else{
       while (i < charArray.size) {
        freq[charArray[i].code]++
        i++
       }
       charArray = t.toCharArray()
       i = charArray.size - 1
       while(i >= 0) {
        freq[charArray[i].code]--
        if(freq[charArray[i].code] == -1){
          result = false
          break
        }
        i--
       }
       i = 0
       
       while( i < charArray.size) {
        if(freq[charArray[i].code] != 0)
        result = false
        break
       }
       }
      return result

}
}
