object Solution {
    def reverseWords(s: String): String = {
        //https://leetcode.com/problems/reverse-words-in-a-string/
        val word = s.split("\\s+").toList.reverse.mkString(" ").trim()
        word
    }
}
