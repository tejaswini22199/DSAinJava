package com.company.Leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _1409Solution {
    public int[] processQueries1(int[] queries, int m) {
        int noOfQueries = queries.length;
        int[] answer = new int[noOfQueries];
        LinkedList queriesList = new LinkedList<>();
        for (int index = 1; index <= m; index++) {
            queriesList.add(index);

        }
        for (int index = 0; index < noOfQueries; index++) {
            int value = queries[index];
            int reqIndex = queriesList.indexOf(value);


            queriesList.remove(reqIndex);
            queriesList.addFirst(value);
            answer[index] = reqIndex;
        }
        return answer;
    }
        public int[] processQueries2(int[] queries, int m){
            int noOfQueries = queries.length;
            int[] answer = new int[noOfQueries];
            LinkedList queriesList = new LinkedList<>();
            for (int index = 1; index <= m; index++) {
                queriesList.add(index);

            }
            for (int index = 0; index < noOfQueries; index++) {
                int value = queries[index];
                int reqIndex = queriesList.indexOf(value);


                queriesList.remove(reqIndex);
                queriesList.addFirst(value);
                answer[index] = reqIndex;
            }
            return answer;
        }


    }