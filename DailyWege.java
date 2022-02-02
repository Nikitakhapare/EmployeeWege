package EmployeeWeag;

public class  DailyWege {

  public static void main(String[] args) {
			 //constant
			int isFullTime=1;
			int ratePerHour=20;
			int empHour=0;
			int empWege=0;
			 //computation
			double empCheck= Math.floor(Math.random()*10)%2;
			 //condition
			if(empCheck==isFullTime)
			    empHour=8;
			else
		            empHour=0;
			empWege=empHour*ratePerHour;
			System.out.println("Employee Wege= "+empWege);
	}

}

