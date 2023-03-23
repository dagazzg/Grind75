class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        invertTree(root.left)
        invertTree(root.right)
        val temp = root.left
        root.left = root.right
        root.right = temp
        return root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}