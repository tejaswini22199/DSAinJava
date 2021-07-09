package com.company.Leetcode;

public class _5Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] isPalindrome=new boolean[n][n];
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                isPalindrome[row][col]=false;
            }
        }

        if(n==0)
            return "";
        if(n==1)
            return s.substring(0,1);
        int low=0;
        int high=0;
        for(int row=0;row<n;row++)
            isPalindrome[row][row]=true;
        for(int row=0;row<n-1;row++)
        {
            if(s.charAt(row)==(s.charAt(row+1))) {
                isPalindrome[row][row + 1] = true;
                low=row;
                high=row+1;

            }

        }

        for(int row=n-1;row>=0;row--)
        {
            for(int col=row;col<n;col++)
            {
                if(col-row>=2 && s.charAt(row)==s.charAt(col) && isPalindrome[row+1][col-1]==true)
                {
                    isPalindrome[row][col]=true;
                    if(col-row+1>high-low+1)
                    {
                        high=col;
                        low=row;
                    }

                }

            }
        }
        return s.substring(low,high+1);
    }
}
