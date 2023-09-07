package studio1;

import java.util.Scanner;

public class LeapYearClass {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Type year: ");
		int year = in.nextInt();
		boolean condition1 = year%4 == 0;
		
		boolean condition2 = year%100 != 0;
		
		boolean condition3 = year%400 == 0;
		
		boolean check = (condition1 && condition2)|| condition3;
		System.out.println(check);

	}

}
