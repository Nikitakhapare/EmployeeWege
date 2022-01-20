package EmployeeWeag;

public class EmpWegeCond {

         public static void main(String[] args) {
	        
	        int Is_Present = 1, monthly_wage = 0, total_hour = 0; 
	        int day_present = 0; int Is_Full_Time=1; int empHour; int Is_Part_Time=0;
            Double EmpCheck = Math.floor(Math.random() * 10) % 3;
            if(EmpCheck==Is_Full_Time)
            	empHour=8;
            else if(EmpCheck==Is_Part_Time)
            	empHour=4;
            else
            	empHour=0;
            	
	        for(int i=1;i<=31;i++) {
	            Double EmpStatus = Math.floor(Math.random() * 10) % 2;
	            if (EmpStatus == Is_Present) {
	                if (day_present < 20 && total_hour < 100) {
	                    day_present += 1;
	                    total_hour += empHour;
	                }

	            }
	        }
	        System.out.println("working day "+day_present);
	        System.out.println("total hour worked "+total_hour);
	        monthly_wage = total_hour * 20;
	        System.out.println("monthly salary is "+monthly_wage);
	    }
	}
	


