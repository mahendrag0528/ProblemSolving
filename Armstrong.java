/*For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Example 1:

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
Example 2:

Input: N = 372
Output: "No"
Explanation: 372 is not an Armstrong number
since 33 + 73 + 23 = 378.
Hence answer is "No".*/

//code of armstrong

class Armstrong {
    static String armstrongNumber(int n){
        // code here
        int l=(int)Math.log10(n)+1;
        int x=n;
        int sum=0;
        while(x!=0){
            sum+=(int)(Math.pow(x%10,l));
            x/=10;
        }
        if(n==sum){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}