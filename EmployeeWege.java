package EmployeeWeag;

public class EmployeeWege {
	public static void main(String[] args) {
		//constant
		int Is_Full_Time=1;
		int Rate_Per_Hour=20;
		int Is_Part_Time=0;
		int empHour=0;
		int empWege=0;
		//computation
		double empCheck= Math.floor(Math.random()*10)%3;
		//condition
		if(empCheck==Is_Full_Time)
		    empHour=8;
		else if(empCheck==Is_Part_Time)
			empHour=4;
		else
			empHour=0;
		empWege=empHour*Rate_Per_Hour;
		System.out.println("Employee Wege= "+empWege);
		}


}
