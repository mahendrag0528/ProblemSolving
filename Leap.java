/* leapYear */
import java.lang.*;
import java.util.*;
public class Leap{
    public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if((n%400==0)||((n%400!=0 && n%100!=0 && n%4==0))){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
}