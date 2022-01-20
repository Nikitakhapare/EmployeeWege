package EmployeeWeag;

public class EmpWegeSwitch {
	//class constants for case
	public static final int Is_Full_Time=1;
	public static final int Rate_Per_Hour=20;
	public static final int Is_Part_Time=0;
    public static void main(String[] args) {
		//variables
    	int empHour=0;
		int empWege=0;
		//computation
		double empCheck= Math.floor(Math.random()*10)%3;
		switch ((int) empCheck) {
	    case Is_Full_Time : empHour=8;
		                    break;
	    case Is_Part_Time : empHour=4;
		                   break;
		          default : empHour=0;
		                    
		}
			
		empWege=empHour*Rate_Per_Hour;
		System.out.println("Employee Wege= "+empWege);


	}

}
