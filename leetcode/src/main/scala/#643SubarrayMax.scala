object Solution {
    //https://leetcode.com/problems/maximum-average-subarray-i/
    def findMaxAverage(nums: Array[Int], k: Int): Double = {
        var sum,left,right = 0 
        var avg: Double = 0
        for(i <- 0 until k) sum +=nums(i)
        var average = sum.toDouble/k.toDouble
        for(i <- k until nums.length){
            sum += nums(i) - nums(i-k)
            avg = sum.toDouble/k.toDouble
            average = math.max(average,avg)
        }
        average
    }
}
