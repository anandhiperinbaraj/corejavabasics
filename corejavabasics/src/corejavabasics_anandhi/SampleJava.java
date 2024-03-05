package corejavabasics_anandhi;
import java.util.*;
public class SampleJava {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a,b,c,d;
		System.out.println("Enter the a and b values:");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		d=a-b;
		System.out.println("Addition of a="+a+" and b="+b+" is :"+c);
		System.out.println("subraction of a="+a+"and b="+b+"is :"+d);
	}

}
