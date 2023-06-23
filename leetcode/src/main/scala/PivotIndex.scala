object Solution {
  //https://leetcode.com/problems/find-pivot-index/
  def pivotIndex(nums: Array[Int]): Int = {
    val totalSum = nums.sum
    var leftSum = 0

    for (i <- 0 until nums.length) {
      val rightSum = totalSum - leftSum - nums(i)
      if (leftSum == rightSum)
        return i
      leftSum += nums(i)
    }

    -1
  }
}
