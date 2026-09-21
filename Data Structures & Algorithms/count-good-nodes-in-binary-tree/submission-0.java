class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return count;
    }

    public void dfs(TreeNode root, int maxSoFar) {
        if (root == null) {
            return;
        }

        // Check if current node is good
        if (root.val >= maxSoFar) {
            count++;
        }

        // Update maximum value on the path
        maxSoFar = Math.max(maxSoFar, root.val);

        // Traverse left and right subtrees
        dfs(root.left, maxSoFar);
        dfs(root.right, maxSoFar);
    }
}