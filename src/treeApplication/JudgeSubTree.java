package treeApplication;

/**
 * 
 * @author Teng Dening
 * 输入两棵二叉树A，B，判断B是不是A的子结构。约定空树不是任意一个树的子结构。
 */
public class JudgeSubTree {
	
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode at1 = new TreeNode(2);
		TreeNode at2 = new TreeNode(3);
		TreeNode at3 = new TreeNode(4);
		a.left = at1;
		at1.left = at2;
		at1.right = at3;
		
		TreeNode b = new TreeNode(2);
		TreeNode bt1 = new TreeNode(3);
		TreeNode bt2 = new TreeNode(4);
		b.left = bt1;
		b.right = bt2;
		
        System.out.print(hasSubtree(a,b));
	}
	
	public static boolean hasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        return isSubTree(root1,root2)||hasSubtree(root1.left,root2)||hasSubtree(root1.right,root2);

    }
    
    public static boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
    } 
}
