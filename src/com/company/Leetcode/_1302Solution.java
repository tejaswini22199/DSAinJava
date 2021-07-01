package com.company.Leetcode;

public class _1302Solution {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private int height=0;
    private int findHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }

    private int deepestLeavesSumHelper(TreeNode root,int depth)
    {
        if(root==null)
            return 0;
        if(depth==height && root.left==null && root.right==null)
            return root.val;
        //  System.out.println(root.val+","+depth);
        return deepestLeavesSumHelper(root.left,depth+1)+
                deepestLeavesSumHelper(root.right,depth+1);

    }
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        height=findHeight(root);
        //System.out.println(height);
        int sumOfLeaves= deepestLeavesSumHelper(root,1);

        return sumOfLeaves;
    }
}
