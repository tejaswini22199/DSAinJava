package com.company.Leetcode;

import java.util.Comparator;

public class CustomComparator implements Comparator<Temp> {
        public int compare(Temp t1,Temp t2)
        {
            if(t1.getCount()<t2.getCount())
            {
                return 1;
            }
            else if(t1.getCount()==t2.getCount())
            {
                return t1.getRowId()< t2.getRowId()?1:0;
            }
            else{
                return 0;
            }

        }
}
