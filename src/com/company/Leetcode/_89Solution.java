package com.company.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _89Solution {
        private boolean grayCodeHelper(List<Integer> gcNumUptoN, Set<Integer> isPresent, int n)
        {
            if(gcNumUptoN.size()==(1<<n))
                return true;
            int last=gcNumUptoN.get(gcNumUptoN.size()-1);
            for(int index=0;index<n;index++)
            {
                int next=last^(1<<index);
                if(!isPresent.contains(next))
                {
                    isPresent.add(next);
                    gcNumUptoN.add(next);
                    if(grayCodeHelper(gcNumUptoN,isPresent,n))
                        return true;
                    isPresent.remove(next);
                    gcNumUptoN.remove(gcNumUptoN.size()-1);

                }
            }
            return false;

        }
        public List<Integer> grayCode(int n) {
            List<Integer> gcNumUptoN=new ArrayList<>();
            gcNumUptoN.add(0);
            Set<Integer> isPresent=new HashSet<>();
            isPresent.add(0);
            grayCodeHelper(gcNumUptoN,isPresent,n);
            return gcNumUptoN;
        }
    }
