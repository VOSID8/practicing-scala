import scala.annotation.tailrec
object Solution {
    //https://leetcode.com/problems/max-number-of-k-sum-pairs/
    def maxOperations(nums: Array[Int], k: Int): Int = {
        @tailrec
        var right,left,cc =0
        var sorted = nums.sorted
        def helper(right: Int, left: Int, cc:Int):Int = {
            if(left >= right) cc
            else if(sorted(right) + sorted(left) == k){
                helper(right-1,left+1,cc+1)
            }
            else {
                if(sorted(right) + sorted(left) < k){
                    helper(right,left+1,cc)
                }
                else helper(right-1,left,cc)
            }
        }
        helper(nums.length-1,0,0)
    }
}


        // while(right>left){
        //     if(sorted(right) + sorted(left) == k) {cc+=1;left+=1;right-=1}
        //     else {
        //         if(sorted(right) + sorted(left) < k)left+=1
        //         else right-=1
        //     }
        // }
        // cc
