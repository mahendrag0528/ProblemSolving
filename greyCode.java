/*gray Code
An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.

 

Example 1:

Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit
Example 2:

Input: n = 1
Output: [0,1]
 

Constraints:

1 <= n <= 16
*/

//brute force
class Solution {
    public static int gray(int n){
        String s="";
        while(n>0){
            int r=n%2;
            if(r==1){
                s="1"+s;
            }
            else{
                s="0"+s;
            }
            n/=2;
        }
        String ss=""+s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                ss+="1";
            }
            else{
                ss+="0";
            }
        }
        System.out.println(ss);
        int soll=0;
        int q=1;
        for(int i=ss.length()-1;i>=0;i--){
            if(ss.charAt(i)=='1')
            soll+=q;
            q=q*2;
        }
        return soll;
    }
    public List<Integer> grayCode(int n) {
        List<Integer> sol=new ArrayList<>();
        sol.add(0);
        sol.add(1);
        for(int i=2;i<(int)(Math.pow(2,n));i++){
            int r=gray(i);
            sol.add(r);
        }
        return new ArrayList<>(sol);
    }
}

//best solution

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> sol=new ArrayList<>();
        sol.add(0);
        sol.add(1);
        for(int i=2;i<(int)(Math.pow(2,n));i++){
            sol.add(i^(i>>1));
        }
        return new ArrayList<>(sol);
    }
}