object Solution {
    //https://leetcode.com/problems/max-consecutive-ones-iii/
    def longestOnes(nums: Array[Int], k: Int): Int = {
        var count, maxCount,i,j = 0 
        while(j < nums.length){
            if(nums(j) == 0) count+=1
            while(count>k){
                if(nums(i) == 0) 
                count -= 1;
                i += 1}
            maxCount = math.max(maxCount,j-i+1)
            j+=1
            }
        maxCount
        }
}
