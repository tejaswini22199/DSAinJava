package com.company.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _658Solution {
    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        List<Integer> kClosestElements=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            kClosestElements.add(arr[i]);
        }
        Collections.sort(kClosestElements,(num1,num2)->Math.abs(num1-x)-Math.abs(num2-x));
        kClosestElements=kClosestElements.subList(0,k);
        Collections.sort(kClosestElements);
        return kClosestElements;
    }
    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        List<Integer> kClosestElements=new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int l = 0;
            int h = arr.length - 1;
            while (l < h) {
                int mid = l + (h - l + 1) / 2;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            kClosestElements.add(arr[i]);
        }
        Collections.sort(kClosestElements,(num1,num2)->Math.abs(num1-x)-Math.abs(num2-x));
        kClosestElements=kClosestElements.subList(0,k);
        Collections.sort(kClosestElements);
        return kClosestElements;
    }

}
