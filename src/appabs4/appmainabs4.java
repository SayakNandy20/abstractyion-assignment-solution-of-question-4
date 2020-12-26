package appabs4;

import java.util.Scanner;

import parentandchildabs4.TaxableIterm;

public class appmainabs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item name");
		String itemname=sc.nextLine();
		System.out.println("Enter Item cost");
		float itemcost=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter GST");
		float GST=sc.nextFloat();
		sc.nextLine();
		
		float totalcost=0;
		float taxamount=0;
		TaxableIterm taxableitem=new TaxableIterm(itemname,itemcost,totalcost,GST,taxamount);
		int tax=taxableitem.findtaxamount();
		if(tax==1)
			System.out.println("total cost:"+taxableitem.getTotalcost());
		else
			System.out.println("-1");
		
		    
		

	}

}
