package EmployeeWeag;

public class EmpWegeSwitch {
	//class constants for case
	public static final int IsFullTime=1;
	public static final int RatePerHour=20;
	public static final int IsPartTime=0;
        public static void main(String[] args)
       {
		//variables
    	int empHour=0;
	int empWege=0;
		//computation
	double empCheck= Math.floor(Math.random()*10)%3;
	switch ((int) empCheck) 
        {
	   case isFullTime : empHour=8;
		                    break;
           case isPartTime : empHour=4;
		                   break;
		          default : empHour=0;
		                    
        }
			
		empWege=empHour*RatePerHour;
		System.out.println("Employee Wege= "+empWege);


	}

}
