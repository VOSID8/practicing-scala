object Solution {
    //https://leetcode.com/problems/move-zeroes/
    def moveZeroes(nums: Array[Int]): Unit = {
        def HelperZ(nums: Array[Int], i: Int, k: Int): Unit = {
            if(i<nums.length){
            if(nums(i)!=0){
                var temp=nums(k)
                nums(k)=nums(i)
                nums(i)=temp
                HelperZ(nums,i+1,k+1)              
            }else HelperZ(nums,i+1,k)
        }}
        HelperZ(nums,0,0)
    }
}
