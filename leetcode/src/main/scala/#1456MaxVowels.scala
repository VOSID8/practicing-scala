object Solution {
    //https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
    def maxVowels(s: String, k: Int): Int = {
        val vowels = Set('a', 'e', 'i', 'o', 'u')
        var count, maxCount = 0 
        for (i <- 0 until k) {
            if (vowels.contains(s(i))) {count +=1; maxCount+=1}}
        for (i <- k until s.length) {
            if (vowels.contains(s(i - k))) count -= 1 
            if (vowels.contains(s(i))) count += 1 
            maxCount = math.max(maxCount, count)}
  
    maxCount}
}
