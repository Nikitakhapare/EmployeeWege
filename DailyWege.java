package EmployeeWeag;

public class  DailyWege {

  public static void main(String[] args) {
			 //constant
			int Is_Full_Time=1;
			int Rate_Per_Hour=20;
			int empHour=0;
			int empWege=0;
			 //computation
			double empCheck= Math.floor(Math.random()*10)%2;
			 //condition
			if(empCheck==Is_Full_Time)
			    empHour=8;
			else
		            empHour=0;
			empWege=empHour*Rate_Per_Hour;
			System.out.println("Employee Wege= "+empWege);
	}

}

