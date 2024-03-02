/* ceil of the number

let tar
find ceil(array,tar)=smallest element in array  >= tar

*/
import java.lang.*;
import java.util.*;
public class CeilOfNum{
	public static int ceil(int[] arr,int tar){
		int i=0,j=arr.length-1;
		while(i<=j){
			int m=i+(j-i)/2;
			if(arr[m]==tar) return tar;
			else if(arr[m]<tar) i=m+1;
			else j=m-1;
		}
		if(i<arr.length)
		return arr[i];
	return -1;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int tar=s.nextInt();
		System.out.println("ceil of array : "+ceil(arr,tar));
	}
}