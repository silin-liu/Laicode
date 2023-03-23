/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isIdentical(TreeNode one, TreeNode two) {
    // Write your solution here
    if(one == null && two == null){
      return true;
    };
    if(one != null && two != null){
      return (one.key == two.key 
           && isIdentical(one.left, two.left)
           && isIdentical(one.right, two.right));
    }
    return false;
  }
}
//O(n)
