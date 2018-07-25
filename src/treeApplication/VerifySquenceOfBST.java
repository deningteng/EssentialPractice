package treeApplication;
/**
 * 
 * @author Teng Dening
 * 判断数组是否为BST的后序遍历
 */
public class VerifySquenceOfBST {
	public static void main(String[] args){
		int[] list = {4,8,6,12,16,14,10};
		System.out.println(verifySquenceOfBST(list));
	}
	
	private static boolean verifySquenceOfBST(int [] list){
		if(list.length == 0)
			return false;
		if(list.length == 1)
			return true;
		return verify(0,list,list.length-1);
	}
	
	private static boolean verify(int start, int[] list, int root){
		if(start >= root)
			return true;
		int index = root;
		while(index > start && list[index - 1] > list[root])
			index--;
		for(int item = start; item < index - 1; item++)
			if(list[item] > list[root])
				return false;
		return verify(start,list,index - 1) && verify(index,list,root - 1);
	}
	
}
