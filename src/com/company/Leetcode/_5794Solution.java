package com.company.Leetcode;
//wrong
public class _5794Solution {
    public boolean sumGame(String num) {
        int noQ=0;
        int fnoQ=0;
        int snoQ=0;
        int fSum=0;
        int sSum=0;
        int half=num.length()/2;
        System.out.println(half);
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='?'){
                noQ++;
                if(i<half)
                    fnoQ++;
                else
                    snoQ++;
            }
            else {
                if (i < half)
                    fSum += num.charAt(i) - '0';
                else
                    sSum += num.charAt(i) - '0';
            }
        }
        System.out.println("fsumI"+fSum);
        System.out.println("sSumI"+sSum);
        if(noQ%2!=0)
            return true;
        else{
            boolean isBob=false;
            for(int i=0;i<num.length();i++)
            {
                if(num.charAt(i)!='?')
                    continue;
                else{
                    if(i<half)
                    {
                        fnoQ--;
                        if(isBob)
                        {
                            if(fSum<sSum)
                                fSum+=((sSum-fSum)>=9)?9:(sSum-fSum);
                        }
                        else {
                            if(fSum>sSum)
                                fSum+=9;
                        }
                    }
                    else{

                        snoQ--;
                        if(isBob)
                        {
                            if(fSum>sSum)
                                sSum+=((fSum-sSum)>=9)?9:(fSum-sSum);
                        }
                        else {
                            if(fSum<sSum)
                                sSum+=9;
                        }

                    }
                }
                System.out.println(fnoQ+"fnoQ");
                System.out.println(snoQ+"snoQ");
                System.out.println(fSum+"fSum");
                System.out.println(sSum+"sSum");
                if(fnoQ==0 && fSum<sSum)
                {
                    return true;
                }
                if(snoQ==0 && sSum<fSum)
                    return true;
                if(snoQ==0 && fSum==sSum)
                    return false;
                isBob=!isBob;
            }
            return false;
        }

    }
}

