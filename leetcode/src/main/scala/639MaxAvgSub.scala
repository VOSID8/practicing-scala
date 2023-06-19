import scala.annotation.tailrec
//https://leetcode.com/problems/maximum-average-subarray-i/
object Solution {
  def findMaxAverage(nums: Array[Int], k: Int): Double = {
    @tailrec
    def helper(right: Int, sum: Double, maxAvg: Double): Double = {
      if (right >= nums.length) maxAvg
      else {
        val newSum = if (right < k) sum + nums(right) else sum - nums(right - k) + nums(right)
        val newMaxAvg = if (right >= k - 1) math.max(maxAvg, newSum / k) else maxAvg
        helper(right + 1, newSum, newMaxAvg)
      }
    }
    
    helper(0, 0, Double.MinValue)
  }
}
