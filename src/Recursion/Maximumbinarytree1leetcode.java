package Recursion;

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
public class Maximumbinarytree1leetcode {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxIndex=i;
            }
        }
        TreeNode root=new TreeNode(max);
        int a[]=new int[maxIndex];
        for(int i=0;i<maxIndex;i++){
            a[i]=nums[i];
        }
        int b[]=new int[nums.length-1-maxIndex];
        int j=maxIndex+1;
        if(j<nums.length){
            for(int i=0;i<b.length;i++){
                b[i]=nums[j];
                j++;
            }
        }
        root.left=constructMaximumBinaryTree(a);
        root.right=constructMaximumBinaryTree(b);
        return root;
    }
}
