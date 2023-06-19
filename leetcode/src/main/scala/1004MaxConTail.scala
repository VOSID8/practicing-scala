object Solution {
    //https://leetcode.com/problems/max-consecutive-ones-iii/description/
    def longestOnes(nums: Array[Int], k: Int): Int = {
        def Helper(right:Int,left:Int,count:Int,maxCount:Int):Int = {
            if(right >= nums.length) maxCount
            else if(nums(right) == 0){
                if(count<k) Helper(right+1,left,count+1,math.max(maxCount,right-left+1))
                else{
                    if(nums(left)==0) Helper(right,left+1,count-1,maxCount)
                    else Helper(right,left+1,count,maxCount)
                }
            }
            else  Helper(right+1,left,count,math.max(maxCount,right-left+1))
             
        }
        Helper(0,0,0,0)
    }
}
