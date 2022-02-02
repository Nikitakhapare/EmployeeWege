package EmployeeWeag;

public class EmpWegeFor{
	public static void main(String[] args) { 
	        //constant
			int isFullTime=1;
			int ratePerHour=20;
			int isPartTime=0;
			int empHour=0;
			int empWege=0;
			int totalEmpWege=0;
			
			//computation
			for(int day=1;day<=20;day++) {
			double empCheck= Math.floor(Math.random()*10)%3;
			//condition
			if(empCheck==isFullTime)
			    empHour=8;

			else if(empCheck==isPartTime)
				empHour=4;
			else
				empHour=0;
			
                        empWege=empHour*ratePerHour;
			totalEmpWege+=empWege;
			
			}
			System.out.println("Employee Wege for month= "+totalEmpWege);

}
}
