package com.email.credentialApp;

import java.util.Scanner;

import com.email.credentialservices.CredentialService;
import com.email.model.Employee;

public class CredentialApp {
String	Employee=null;
	public static void 	main(String[] args) {
	    System.out.println("Please enter the depatment from the folowing:");
		System.out.println("1. Technical");
	     System.out.println("2. Admin");
	     System.out.println("3. Human Resource");
	     System.out.println("4. Legal");
	     
	     Employee employee = new Employee("Dhananjay","Goyal");
CredentialService credentialservice = new CredentialService();
String generatedEmail="";
char[] generatedPwd;
	     Scanner scanner =new Scanner(System.in);
	     int option=scanner.nextInt();
	     if (option==1){generatedEmail=credentialservice.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");

	     }else if (option==2){generatedEmail=credentialservice.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"adm");
	 	 	}else if (option==3) {generatedEmail=credentialservice.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"hr");
	 
	}else if (option==4) {generatedEmail=credentialservice.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"leg");
	 
	}else { System.out.println("Enter a valid option");
	     scanner.close();
	     System.exit(-1);
	}

	generatedPwd=credentialservice.generatePassword(); 
	credentialservice.showCredentials(employee.getFirstName(),generatedEmail,generatedPwd);
	scanner.close();
}}