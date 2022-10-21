// <<---DESCRIPTION--->>
//leetcode - 113
//Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

// A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.


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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        hasPath(root , targetSum , new ArrayList<Integer>(),list);
        
        return list;
    }
    
    public void hasPath(TreeNode root,int sum,List<Integer> current,List<List<Integer>>list){
        if(root == null)
            return;
        
        current.add(root.val);
        if(root.val == sum && root.left == null && root.right == null ){
            list.add(current);
            return;
        }
        
        hasPath(root.left,sum - root.val,new ArrayList<Integer>(current),list);
        hasPath(root.right,sum - root.val,new ArrayList<Integer>(current),list);
    }
}