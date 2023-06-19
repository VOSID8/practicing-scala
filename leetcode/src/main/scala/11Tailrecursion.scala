import scala.annotation.tailrec
object Solution {
    //https://leetcode.com/problems/container-with-most-water/
    def maxArea(height: Array[Int]): Int = {
        @tailrec
        var curr,max,left=0
        var right=(height.length-1)
        def helper(left:Int, right:Int,max: Int): Int = {
            if(left >= right) max
            else {
                val curr = height(right).min(height(left)) * (right-left)
                val newMax = math.max(max,curr)
                if (height(left) < height(right))
                    helper(left + 1, right, newMax)
                else
                    helper(left, right - 1, newMax)
            }
        }
        helper(0,height.length-1,0)
    }
}



        // while(left < right){
        //     curr = height(right).min(height(left)) * (right-left)
        //     if(curr>max){
        //          max=curr
        //          }
        //     if(height(right)>height(left)) left+=1
        //     else right-=1
        // }



        
        // for(i <- 0 until height.length){
        //     curr = height(k).max(height(i)) * (k-i)
        //     if(curr>max){
        //         max=curr
        //     }
        // }
        
