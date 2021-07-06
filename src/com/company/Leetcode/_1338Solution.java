package com.company.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1338Solution {
    class Solution {
        public int minSetSize(int[] arr) {
            Map< Integer, Integer> unSortedMap=new HashMap<>();
            // LinkedHashMap<Integer,Integer> reverseSortedMap=new LinkedHashMap<>();
            List<Integer>[] list = new ArrayList[arr.length+1];
            for(int i=0;i<arr.length;i++)
            {
                int c=unSortedMap.getOrDefault(arr[i],0);
                unSortedMap.put(arr[i],c+1);
            }
            for(int num:unSortedMap.keySet()){
                int count=unSortedMap.get(num);
                if(list[count]==null)
                {
                    list[count]=new ArrayList<Integer>();
                }
                list[count].add(num);
            }
            int count=0;
            int sum=0;
            for(int i=arr.length;i>0;i--)
            {
                List<Integer> current=list[i];
                if(current==null||current.size()==0)
                {
                    continue;
                }
                else{
                    for(int num:current){
                        count++;
                        sum+=i;
                        if(sum>=arr.length/2)
                            return count;
                    }
                }
            }
            return count;
        }
    }
}
