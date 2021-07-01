package com.company.Leetcode;


public class _1769Solution {
    public int[] minOperations1(String boxes) {
        int noBoxes=boxes.length();

        int[] moves=new int[noBoxes];
        int noOfOnesToLeft=0;
        int noOfOnesToRight=0;
        int sumOfOnesToLeft=0;
        int sumOfOnesToRight=0;
        int totalSum=0;
        int totalOnes=0;
        for(int index=0;index<noBoxes;index++)
        {
            if(boxes.charAt(index)=='1')
            {
                totalSum+=index;
                totalOnes++;
            }
        }
        for(int index=0;index<noBoxes;index++)
        {
            if(boxes.charAt(index)=='1')
            {
                noOfOnesToLeft++;
                sumOfOnesToLeft+=index;

            }
            sumOfOnesToRight=totalSum-sumOfOnesToLeft;
            noOfOnesToRight=totalOnes-noOfOnesToLeft;
            moves[index]=noOfOnesToLeft*(index)-sumOfOnesToLeft+sumOfOnesToRight-
                    noOfOnesToRight*(index);
        }
        return moves;
    }
    public int[] minOperations2(String boxes) {

        int noBoxes=boxes.length();

        int[] moves=new int[noBoxes];
        for(int firstIndex=0;firstIndex<noBoxes;firstIndex++)
        {
            for(int secondIndex=0;secondIndex<noBoxes;secondIndex++)
            {
                if(boxes.charAt(secondIndex)=='1')
                {
                    moves[firstIndex]+=Math.abs(secondIndex-firstIndex);
                }
            }
        }
        return moves;

    }

}
