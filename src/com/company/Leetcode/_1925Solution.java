package com.company.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class _1925Solution {

        public int countTriples(int n) {
            Set<Integer> s=new HashSet<>();
            for(int i=1;i<=n;i++)
            {
                s.add(i*i);
            }
            int count=0;
            //for(int i=1;i<=n;i++)
            //{
            for(int j=1;j<=n;j++)
            {
                for(int k=1;k<=n;k++)
                {
                    if(s.contains(j*j-k*k)==true)
                        count++;
                }
            }
            return count;

        }
    }
