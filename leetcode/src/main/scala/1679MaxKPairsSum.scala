//https://leetcode.com/problems/max-number-of-k-sum-pairs/
object Solution {
    def maxOperations(nums: Array[Int], k: Int): Int = {
        var sorted = nums.sorted
        var left=0 
        var right=sorted.length-1
        var cc = 0
        while(right>left){
            if(sorted(right) + sorted(left) == k) {cc+=1;left+=1;right-=1}
            else {
                if(sorted(right) + sorted(left) < k)left+=1
                else right-=1
            }
        }
        cc
    }
}
