object Solution {
//https://leetcode.com/problems/removing-stars-from-a-string/
  def removeStars(s: String): String = {
    def helper(list: List[Char], acc: List[Char] ): String =
      if(list.isEmpty) acc.reverse.mkString 
      else if(acc.nonEmpty && list.head == '*') helper(list.tail, acc.tail)
      else  helper(list.tail, list.head :: acc)
    helper(s.toList,List.empty[Char])
  }
}
