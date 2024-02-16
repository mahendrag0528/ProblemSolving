/***** Longest Substring Without Repeating Characters *****/

/*   Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.  **/

//code

class LongSubStringWithoutRepet {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        //store previous disthinct
        List<Character> x=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            while(x.contains(str)){
                x.remove(0);
            }
            x.add(str);
            ans=Math.max(ans,x.size());
        }
        return ans;
    }
}