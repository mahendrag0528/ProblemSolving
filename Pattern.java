/*You are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Note: Instead of printing a new line print a "$" without quotes. After printing the total output, end of the line("$") is expected.

Example 1:

Input: 2
Output:
2 2 1 1 $2 1 $
*/

//logic 

class GfG
{
    void printPat(int n)
    {
         // Your code here
         for(int i=n;i>0;i--){
             for(int j=n;j>0;j--){
                 for(int k=i;k>0;k--){
                     System.out.print(j+" ");
                 }
             }
             System.out.print("$");
         }
    }
}