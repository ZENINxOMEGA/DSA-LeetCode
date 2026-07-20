/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        longest(root);
        return diameter;
    }
    public int longest(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left_side = longest(root.left);
        int right_side = longest(root.right);
        diameter = Math.max(diameter,left_side+right_side);
        return Math.max(left_side , right_side) + 1;
    }
}