/*Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
Example 2:

Input:
N=98
Output:
0
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is 0.
*/


class DigitSumPalinOrNot {
    int isDigitSumPalindrome(int N) {
        // code here
        int sum=0;
        while(N>0){
            sum+=(N%10);
            N/=10;
        }
        String str=Integer.toString(sum);
        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            return 0;
        }
        return 1;
    }
}