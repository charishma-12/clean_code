package com.epam.clean_code;
import java.util.*;
public class main_interest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter values for principal Amount,time,rate of interest");
		int amount=in.nextInt();
		int time=in.nextInt();
		float rate=in.nextFloat();
		interest_calc c=new interest_calc(amount,time,rate);
		System.out.println("Simple interest is : "+c.simple_interest());
		System.out.println("Compound Interest is : "+c.compund_interest());
	}
}
