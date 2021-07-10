package com.company.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _1926Solution {


        private int[][] ways={{0,1},{0,-1},{1,0},{-1,0}};
        private boolean isValid(char[][] maze,int r,int c)
        {
            int m=maze.length;
            int n=maze[0].length;
            if(r<m && r>=0 && c<n && c>=0 && maze[r][c]=='.')
                return true;
            return false;
        }
        private boolean isExit(char[][] maze,int r,int c,int[] entrance)
        {
            int m=maze.length;
            int n=maze[0].length;
            if(r==entrance[0] && c==entrance[1])
                return false;
            if(r==m-1 || c==n-1||r==0||c==0)
                return true;
            return false;
        }
        public int nearestExit(char[][] maze, int[] entrance) {
            Queue<int[]> q=new LinkedList<>();
            int count=0;
            q.add(entrance);
            int m=maze.length;
            int n=maze[0].length;
            boolean[][] visited=new boolean[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    visited[i][j]=false;
                }
            }

            while(!q.isEmpty()){

                int size=q.size();
                for(int j=0;j<size;j++)
                {
                    int [] temp=q.remove();
                    int r=temp[0];
                    int c=temp[1];
                    if(visited[r][c]==true)
                        continue;
                    visited[r][c]=true;
                    if(isExit(maze,r,c,entrance))
                        return count;

                    for(int i=0;i<4;i++)
                    {
                        int x=r+ways[i][0];
                        int y=c+ways[i][1];

                        if(isValid(maze,x,y) && !visited[x][y] )
                            q.add(new int[]{x,y});
                    }
                }

                count++;

            }
            return -1;
        }
    }
