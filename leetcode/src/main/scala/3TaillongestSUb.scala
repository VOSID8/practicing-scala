import scala.annotation.tailrec
object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/
        @tailrec
        def helper(start:Int,end:Int,charSet: Set[Char],maxl:Int): Int = {
            if(end >= s.length) maxl
            else if(charSet.contains(s(end))){
                val newCharSet = charSet - s(start)
                helper(start+1,end,newCharSet,maxl)
            }
            else {
                val newCharSet = charSet + s(end)
                val maxlll = math.max(maxl,end-start+1)
                helper(start,end+1,newCharSet,maxlll)
            }
        }
        helper(0,0,Set[Char](),0)
    }
}