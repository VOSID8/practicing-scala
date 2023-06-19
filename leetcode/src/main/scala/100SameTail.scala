/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    //https://leetcode.com/problems/same-tree/
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
        if(p==null && q==null) true
        else if(p==null || q==null) false
        else p.value == q.value && isSameTree(p.left, q.left) &&
         isSameTree(p.right, q.right)
    }
}
