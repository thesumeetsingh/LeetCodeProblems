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

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public Queue<Integer> que= new LinkedList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        que.add(root.val);
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root);
        while(k>1){
            System.out.println(que.remove());
            k--;
        }
        return que.remove();
    }
}