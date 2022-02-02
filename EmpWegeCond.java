package EmployeeWeag;

public class EmpWegeCond {

         public static void main(String[] args) {
	        
	        int isPresent = 1, monthlyWage = 0, totalHour = 0; 
	        int dayPresent = 0; int isFullTime=1; int empHour; int isPartTime=0;
                Double empCheck = Math.floor(Math.random() * 10) % 3;
                if(empCheck==isFullTime)
            	empHour=8;
                else if(empCheck==isPartTime)
            	empHour=4;
            else
            	empHour=0;
            	
	        for(int i=1;i<=31;i++) {
	            Double empStatus = Math.floor(Math.random() * 10) % 2;
	            if (empStatus == isPresent) {
	                if (dayPresent < 20 && totalHour < 100) {
	                    dayPresent += 1;
	                    totalHour += empHour;
	                }

	            }
	        }
	        System.out.println("working day "+dayPresent);
	        System.out.println("total hour worked "+totalHour);
	        monthlyWage = totalHour * 20;
	        System.out.println("monthly salary is "+monthlyWage);
	    }
	}
	


