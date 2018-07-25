package treeApplication;
/**
 * 
 * @author Teng Dening
 * 给定的二叉树，将其变换为源二叉树的镜像
 */
public class MirrorTree {
	
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode at1 = new TreeNode(2);
		TreeNode at2 = new TreeNode(3);
		TreeNode at3 = new TreeNode(4);
		a.left = at1;
		at1.left = at2;
		at1.right = at3;
		
		transfer(a);
	}
	public static void transfer(TreeNode root) {
        if(root != null){
            if(root.left != null || root.right != null){
            TreeNode tmp = null;
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        transfer(root.left);
        transfer(root.right);
        }
    }
}
