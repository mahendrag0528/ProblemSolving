/*Given  two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

 

Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.*/



class ClosestNum {
    static int closestNumber(int n , int m) {
        // code here
        if(n%m==0){
            return n;
        }
        if(n>0 && m>0 || n<0 && m<0){
            int d=n/m;
            int f=d*m;
            int s=(d+1)*m;
            int ff=Math.abs(n-f);
            int ss=Math.abs(s-n);
            if(ff>=ss){
                return s;
            }
            else
            return f;
        }
        else{
            int d=n/m;
            int f=d*m;
            int s=(d-1)*m;
            int ff=Math.abs(n-f);
            int ss=Math.abs(s-n);
            if(ff>=ss){
                return s;
            }
            else
            return f;
        }
        //return 0;
    }
};