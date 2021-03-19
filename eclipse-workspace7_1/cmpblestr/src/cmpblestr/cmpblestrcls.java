package cmpblestr;

import java.lang.String;
public class cmpblestrcls{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="magilan";
		String s2="magilan";
		String s3="hello";
		int r=s1.compareTo(s2);
		System.out.println("comparison is: "+r);
		if(r==0)
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not same");

	}

}
