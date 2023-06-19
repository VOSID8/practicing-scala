object Solution {
    //https://leetcode.com/problems/merge-strings-alternately
    def mergeAlternately(word1: String, word2: String): String = {
    def mergeHelper(w1: String, w2: String, merged: String): String = {
      if (w1.isEmpty && w2.isEmpty) {
        merged
      } else if (w1.isEmpty) {
        mergeHelper(w1, w2.tail, merged + w2.head)
      } else if (w2.isEmpty) {
        mergeHelper(w1.tail, w2, merged + w1.head)
      } else {
        mergeHelper(w1.tail, w2.tail, merged + w1.head + w2.head)
      }
    }
    mergeHelper(word1, word2, "")
  }
}
