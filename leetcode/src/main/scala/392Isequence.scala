object Solution {
    //https://leetcode.com/problems/is-subsequence/
    def isSubsequence(s: String, t: String): Boolean = {
        if(s.isEmpty)true
        else if(t.isEmpty)false
        else if(s.head==t.head) isSubsequence(s.tail,t.tail)
        else isSubsequence(s,t.tail)
    }
}