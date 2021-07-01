package com.company.Leetcode;

import java.util.*;

public class _1282Solution  {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> L=new ArrayList<List<Integer>>();
        Map<Integer, List<Integer>> elementsOfSameFreq=new HashMap<>();
        for(int index=0;index<groupSizes.length;index++)
        {
            List<Integer> numbersEqualToCurrent = elementsOfSameFreq.getOrDefault(groupSizes[index],new ArrayList<Integer>());

            numbersEqualToCurrent.add(index);
            elementsOfSameFreq.put(groupSizes[index],numbersEqualToCurrent);

            elementsOfSameFreq.put(groupSizes[index],numbersEqualToCurrent);
        }
        List<Integer> temp=new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry:elementsOfSameFreq.entrySet())
        {
            int key=entry.getKey();
            temp =entry.getValue();

            for(int i=0;i<temp.size();i++)
            {
                int j=i;
                List<Integer> sub=new ArrayList<>();
                while(j-i<key)
                {
                    sub.add(temp.get(j));
                    j++;
                }
                i=j-1;
                L.add(sub);
            }
        }

        return L;
    }
}