package com.company.Leetcode;

import java.util.LinkedList;
import java.util.List;

public class _894Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans=new LinkedList();
        if(n==1)
            ans.add(new TreeNode(0));
        else if(n%2==1){
            for(int i=1;i<n;i=i+2){

                for(TreeNode left:allPossibleFBT(i))
                {
                    for(TreeNode right:allPossibleFBT(n-i-1))
                    {
                        TreeNode root=new TreeNode(0);
                        root.left=left;
                        root.right=right;
                        ans.add(root);
                    }
                }




            }
        }
        return ans;
    }
}
