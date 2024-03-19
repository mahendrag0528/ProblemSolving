import java.lang.*;
import java.util.*;

public class SumTriangleArray{
	public static void funct(List<Integer> x,List<List<Integer>> ans){
		if(x.size()>1){
			List<Integer> a=new ArrayList<>();
			for(int i=1;i<x.size();i++){
				a.add(x.get(i)+x.get(i-1));
			}
			funct(a,ans);
			ans.add(x);
		}else{
		ans.add(x);
		}
	}		
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<Integer> x=new ArrayList<>();
		for(int i=1;i<=n;i++){
			x.add(i);
		}
		List<List<Integer>> ans=new ArrayList<>();
		funct(x,ans);
		//ans.add(x);
		for(List<Integer> i:ans)
		System.out.println(i);
	}
}