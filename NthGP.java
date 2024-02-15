/*Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.

Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term.*/

class Solution
{
    // public static long power(int x,int n){
    //     long ans=1;
    //     while(n>0){
    //         if((n&1)==1){
    //             ans=(ans*x)%(1000000007);
    //         }
    //         x=(x*x)%(1000000007);
    //         n=n>>1;
    //     }
    //     return ans%(1000000007);
    // }
    public int Nth_term(int a, int x, int n)
    {
        // code here
        n=n-1;
        long ans=a;
        while(n>0){
            if((n&1)==1){
                ans=(ans*x)%(1000000007);
            }
            x=(x*x)%(1000000007);
            n=n>>1;
        }
        return (int)(ans%1000000007);
    }
}