//https://leetcode.com/problems/container-with-most-water/
object Solution {
    def maxArea(height: Array[Int]): Int = {
        var curr,max,left=0
        var right=(height.length-1)
        while(left < right){
            curr = height(right).min(height(left)) * (right-left)
            if(curr>max){
                 max=curr
                 }
            if(height(right)>height(left)) left+=1
            else right-=1
        }    
        // for(i <- 0 until height.length){
        //     curr = height(k).max(height(i)) * (k-i)
        //     if(curr>max){
        //         max=curr
        //     }
        // }
        max
    }
}
