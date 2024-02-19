/* Longest palindromic substring 


Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

*/

public class LongestPalinSubStr {
    //pallindrome code
    public static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int lenStr=s.length(); //length of string
        //sliding window approach
        for(int n=lenStr;n>1;n--){
            //initial list indexes
            int i=0,j=n-1;
            //window moving
            while(j<lenStr){
                if(isPalindrome(s,i,j)==true){   //check substring from i to j is palindrome or not
                    String ans="";
                    for(int ind=i;ind<=j;ind++){
                        ans+=s.charAt(ind);
                    }
                    return ans;
                }
                i++;
                j++;
            }
        }
        //there is no palindrome with len>2
        return ""+s.charAt(0)+"";
    }
}