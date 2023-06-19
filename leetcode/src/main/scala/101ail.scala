object Solution {
    //https://leetcode.com/problems/symmetric-tree/
    def mirrored(tree1: TreeNode,tree2: TreeNode): Boolean = {
        if(tree1 == null && tree2 == null) true
        else if(tree1 == null || tree2 == null) false
        else {tree1.value == tree2.value && mirrored(tree1.left,tree2.right) && 
        mirrored(tree1.right,tree2.left)}
    }

    def isSymmetric(root: TreeNode): Boolean = {
        if (root == null) true
        else mirrored(root.left,root.right)
    }
}
