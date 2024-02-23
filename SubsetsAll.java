/* All subsets generation 

Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> sol=new HashSet<>();
        int n=nums.length;
        int len=(int)Math.pow(2,n);
        for(int i=0;i<len;i++){
            int id=i;
            List<Integer> x=new ArrayList<>();
            for(int j=n-1;j>=0;j--){
                if((id&1)==1){
                    x.add(nums[j]);
                }
                id>>=1;
            }
            sol.add(new ArrayList<>(x));
        }
        return new ArrayList<>(sol);
    }
}