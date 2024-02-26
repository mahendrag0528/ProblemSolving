/* fibonacci number*/

import java.lang.*;
import java.util.*;
public class Fibonacci{
     public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a=0,b=1;
	 for(int i=0;i<n;i++){
	 int t=a+b;
	 a=b;
	 b=t;
	 System.out.print(a+" ");
	 }
	 }
	 }