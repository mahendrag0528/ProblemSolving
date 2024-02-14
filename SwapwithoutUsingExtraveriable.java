import java.lang.*;
import java.util.*;
public class SwapwithoutUsingExtraveriable{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Before swap:");
		int a=s.nextInt();
		int b=s.nextInt();
		//using arthmetic
		//a=a+b;
	    //b=a-b;
		//a=a-b;
		
		//using xor
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap: "+a+" "+b);
	}
}