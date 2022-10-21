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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        return cons(nums,0,nums.length-1);
    }
    
    public TreeNode cons(int[] nums,int l,int u){
        int mid = l + (u-l)/2;
        if(l>u)
            return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = cons(nums,l,mid-1);
        root.right = cons(nums,mid+1,u);
        
        return root;
    }
}
