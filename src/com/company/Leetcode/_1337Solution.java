package com.company.Leetcode;

import java.util.Arrays;

public class _1337Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        Temp[] countAndIndex=new Temp[mat.length];
        for(int index=0;index<mat.length;index++)
        {
            int sum=0;
            for(int index1=0;index1<mat[0].length;index++)
            {
                sum+=mat[index][index1];
            }
            countAndIndex[index]=(new Temp(sum,index));
        }
        Arrays.sort(countAndIndex,new CustomComparator());
        int[] result=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            result[i]=countAndIndex[i].getRowId();
        }
        return result;
    }
    public void print(Temp[] countAndIndex)
    {
        for(int i=0;i<countAndIndex.length;i++)
        {
            System.out.println(countAndIndex[i].getCount()+","+countAndIndex[i].getRowId());
        }
    }
}
