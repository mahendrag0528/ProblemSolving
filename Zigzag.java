/* 6. Zigzag coversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 
 */
 
 
class Zigzag {
    public String convert(String s, int n) {
        if(n==1) return s;
        String sol="";
        for(int i=0;i<n;i++){
            int j=i;
            while((j)<s.length()){
                sol+=s.charAt(j);
                if(i>0 && i<(n-1) && (j+(n-1)*2-(2*i))<(s.length())){
                    int r=j+(n-1)*2-(2*i);
                    sol+=s.charAt(r);
                }
                j+=((n-1)*2);
            }
        }
        return sol;
    }
}