package com.company.Leetcode;

public class _1051Solution {
    public int heightChecker(int[] heights) {
        Map<Integer,Integer> freqOfHeights=new HashMap<Integer,Integer>();
        int length=heights.length;
        for(int index=0;index<length;index++)
        {
            int count = freqOfHeights.getOrDefault(heights[index],0);
            freqOfHeights.put(heights[index],count+1);
            // System.out.println(count);
        }
        int currHeight=0;
        int diff=0;
        for(int index=0;index<length;index++)
        {
            while(freqOfHeights.containsKey(currHeight)==false || freqOfHeights.get(currHeight)==0)
            {
                currHeight++;
            }
            if(heights[index]!=currHeight)
            {
                //   System.out.print(heights[index]+","+currHeight);
                //System.out.println();
                diff++;
            }

            int count = freqOfHeights.getOrDefault(currHeight,0);
            if(count>0)
                freqOfHeights.put(currHeight,count-1);
        }
        return diff;
    }
}
