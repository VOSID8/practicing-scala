//https://leetcode.com/problems/greatest-common-divisor-of-strings
object Solution {
  def gcdOfStrings(str1: String, str2: String): String = {
    if (str2.isEmpty) str1
    else if (str1.length < str2.length) gcdOfStrings(str2, str1)
    else if (!str1.startsWith(str2)) ""
    else {
      val remaining = str1.substring(str2.length)
      gcdOfStrings(remaining, str2)
    }
  }
}
