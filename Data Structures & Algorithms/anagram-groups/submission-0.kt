class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    /*
    Bruteforce
    */
    val hashMap = HashMap<String,MutableList<String>>()

    for (word in strs) {
        val freq = Array(26){0}
        for (c in word) {
        freq[c - 'a']++
        }

        val wordfreqKey = freq.joinToString("#")
        var group = hashMap[wordfreqKey]

        if (group == null) {
            group = mutableListOf()
            hashMap[wordfreqKey] = group
        }

        group.add(word) // shared reference of memory of hashmap value
          
    }
        return hashMap.values.toList()
    }
}
