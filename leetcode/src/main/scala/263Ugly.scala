object Solution {
    //https://leetcode.com/problems/ugly-number/
    def isUgly(n: Int): Boolean = {
        if(n <= 0)false
        else if(n == 1) true
        else if(n%2 == 0) isUgly(n/2)
        else if(n%3 == 0) isUgly(n/3)
        else if(n%5 == 0) isUgly(n/5)
        else false 
    }
}
