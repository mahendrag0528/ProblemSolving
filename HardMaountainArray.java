
/*

(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

 

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 
*/

//code

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class HardMountainArry {

    public static int binarySearch(MountainArray m,int s,int e,int tar){
        int a=1;
        if(m.get(s)>m.get(e)){
            a=0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            int k=m.get(mid);
            if(tar==k)
            return mid;
            else{
                if(a==1){
                    if(tar<k){
                        e=mid-1;
                    }
                    else{
                        s=mid+1;
                    }
                }
                else{
                    if(tar>k){
                        e=mid-1;
                    }
                    else{
                        s=mid+1;
                    }
                }
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray m) {
        int s=0,e=m.length()-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(m.get(mid)>m.get(mid+1)){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(s);
        int ans=binarySearch(m,0,s,target);
        if(ans!=-1){
            return ans;
        }
        int sol=binarySearch(m,s+1,m.length()-1,target);
        if(sol!=-1){
            return sol;
        }
        return -1;
    }
}