package EmployeeWeag;

public class EmployeeWege {
	public static void main(String[] args) {
		
		int isFullTime=1;
		int ratePerHour=20;
		int isPartTime=0;
		int empHour=0;
		int empWege=0;
		//computation
		double empCheck= Math.floor(Math.random()*10)%3;
		//condition
		if(empCheck==isFullTime)
		    empHour=8;
		else if(empCheck==isPartTime)
			empHour=4;
		else
			empHour=0;
		empWege=empHour*ratePerHour;
		System.out.println("Employee Wege= "+empWege);
		}


}
