/* reverse Integer 

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321 
*/

//code

class ReverseInt {
    public int reverse(int x) {
        int s=0;
        if(x<0){
            x*=(-1);
            s=-1;
        }
        long ans=0;
        while(x>0){
            ans=ans*10+(x%10);
            if(!(ans>=(-2147483648) && ans<=2147483647))
            return 0;
            x/=10;
        }
        if(s==(-1)){
            ans*=-1;
        }
        if(!(ans>=(-2147483648) && ans<=2147483647))
        return 0;
        return (int)ans;
    }
}