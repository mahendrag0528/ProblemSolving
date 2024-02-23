/* Add two numbers

Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/


class Solution {
    public String addBinary(String a, String b) {
        int c=0;
        String sol="";
        int i=a.length()-1,j=b.length()-1;
        while(i>=0 && j>=0){
            int s=c+(a.charAt(i)-'0')+(b.charAt(j)-'0');
            if(s==0){
                c=0;
                sol="0"+sol;
            }
            else if(s==1){
                c=0;
                sol="1"+sol;
            }
            else if(s==2){
                c=1;
                sol="0"+sol;
            }
            else{
                c=1;
                sol="1"+sol;
            }
            i--;
            j--;
        }
        while(i>=0){
            int s=c+(a.charAt(i)-'0');
             if(s==0){
                c=0;
                sol="0"+sol;
            }
            else if(s==1){
                c=0;
                sol="1"+sol;
            }
            else{
                c=1;
                sol="0"+sol;
            }
            i--;
        }
        while(j>=0){
            int s=c+(b.charAt(j)-'0');
            if(s==0){
                c=0;
                sol="0"+sol;
            }
            else if(s==1){
                c=0;
                sol="1"+sol;
            }
            else{
                c=1;
                sol="0"+sol;
            }
            j--;
        }
        if(c==1){
            sol="1"+sol;
        }
        return sol;
    }
}