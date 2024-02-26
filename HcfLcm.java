/* hcf and lcm of 2 numbers*/
import java.lang.*;
import java.util.*;
public class HcfLcm{
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int g=gcd(a,b);
		int l=((a*b)/g);
		System.out.println("hcf: "+g+"Lcm: "+l);
	}
}