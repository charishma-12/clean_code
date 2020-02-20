package com.epam.clean_code;
import java.util.*;
public class main_house {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter area of the House and material Type required among\n1.standard\n2.above standard\n3.high standard\n4.high standard and automated");
		float area=in.nextFloat();
		int type=in.nextInt();
		house_cons h=new house_cons(area,type);
		System.out.println(h.calc_cost());
	}

}
