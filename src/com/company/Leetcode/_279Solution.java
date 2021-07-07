package com.company.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _279Solution {
    class Solution {
        public int numSquares(int n) {
            List<Integer> perfectSquares=new ArrayList<>();
            for(int i=1;i<=100;i++){
                perfectSquares.add(i*i);
                //  System.out.println(i*i);
            }
            int[] dp=new int[10002];
            Arrays.fill(dp,Integer.MAX_VALUE);
            dp[0]=0;
            for(int i=1;i<=n;i++){
                for(int x: perfectSquares){
                    //  System.out.println(x);
                    if(i>=x)
                        dp[i]=Math.min((dp[i-x]+1),dp[i]);
                    else
                        break;
                }
            }
            return dp[n];
        }
    }

}
