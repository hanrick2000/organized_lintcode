package lintcode;
class Solution {
    //how many trailing 0s in n!
    //how many number mod 5 + mod 25 +...
    //since always more mod2 than mod5
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    // all 0s from 2*5; there are no less 2 than 5 
    public long trailingZeros(long n) {
        // write your code here
        long ans=0;
        while(n>0){
            ans+=n/5;
            n/=5;
        }
        return ans;
    }
};
