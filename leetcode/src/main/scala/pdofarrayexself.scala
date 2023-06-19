object Solution {
    //https://leetcode.com/problems/product-of-array-except-self
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val n = nums.length
    val result = new Array[Int](n)
    def helper(pt: Int, leftProduct: Int): Unit = {
      if (pt >= n) return
      result(pt) = leftProduct
      helper(pt + 1, leftProduct * nums(pt))
    }
    helper(0, 1)
    def calProduct(pt: Int, rightProduct: Int): Unit = {
      if (pt < 0) return
      result(pt) *= rightProduct
      calProduct(pt - 1, rightProduct * nums(pt))
    }
    calProduct(n - 1, 1)
    result
  }
}

