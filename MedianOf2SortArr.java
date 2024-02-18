/* leetcode 4. Median of two sorted array 

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6

*/


//code 

class MedianOf2SortArr {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length,m=b.length;
        int l=n+m;
        int ans[]=new int[l];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                ans[k]=a[i];
                i++;
            }
            else{
                ans[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k++]=a[i++];
        }
        while(j<m){
            ans[k++]=b[j++];
        }
        double sol=1.0;
        if(l%2==0){
            sol=((ans[l/2]+ans[(l/2)-1])/(2.0));
        }
        else{
            sol=(ans[l/2]/sol);
        }
        return sol;
    }
}