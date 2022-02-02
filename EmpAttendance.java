package EmployeeWeag;

public class EmployeeAttendance_us1 {

	public static void main(String[] args) {
		//constant
		int isPresent=1;
		//computation
		double empCheck= Math.floor(Math.random()*10)%2;
		if(empCheck==isPresent)
		    System.out.println("Employee is Present");
		else
		    System.out.println("Employee is Absent");
    }

}