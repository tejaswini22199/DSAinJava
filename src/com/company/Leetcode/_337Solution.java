package com.company.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class _337Solution {
    private int robHelper1(TreeNode root, Map<TreeNode,Integer> map)

    {
        if(root==null)
            return 0;
        if(map.containsKey(root))
            return map.get(root);
        int val=0;
        if(root.left!=null){
            val+=robHelper1(root.left.left,map)+robHelper1(root.left.right,map);
        }
        if(root.right!=null)
        {
            val+=robHelper1(root.right.left,map)+robHelper1(root.right.right,map);
        }
        val=Math.max(val+root.val,robHelper1(root.left,map)+robHelper1(root.right,map));
        map.put(root,val);
        return val;

    }
    public int rob1(TreeNode root) {
        if(root==null)
            return 0;
        return robHelper1(root,new HashMap<>());
    }
    private int[] robHelper2(TreeNode root)
    {
        if(root==null)
            return new int[2];
        int[] left=robHelper2(root.left);
        int[] right=robHelper2(root.right);
        int[] res=new int[2];
        res[0]= Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1]=root.val+left[0]+right[0];
        return res;
    }
    public int rob2(TreeNode root) {
        if(root==null)
            return 0;
        int res[]=robHelper2(root);
        return Math.max(res[0],res[1]);
    }
}
