import scala.annotation.tailrec
object Solution {
    //https://leetcode.com/problems/two-sum/
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        @tailrec
        def helper(index: Int): Array[Int] = {
            val complement = target - nums(index)
            val complementIndex = nums.indexOf(complement,index+1)
            if(complementIndex != -1) Array(index,complementIndex)
            else helper(index+1)
        }
        helper(0)
    }
}
