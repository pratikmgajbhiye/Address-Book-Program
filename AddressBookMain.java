package com.AddressBookProgram;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");
		
		AdderssBook obj=new AdderssBook();
		int option;
		boolean A=true;
		
		while(A) {
			System.out.println("\n1.ADD CONTACT \n2.DISPLAY CONTACT \n3.EDIT CONTACT \n4.DELETE CONTACT \n");
			System.out.println("Enter the Option Number");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				obj.addContacts();
				break;
			case 2:
				obj.displayContact();
				break;
			case 3:
				obj.editContacts();
				break;	
			case 4:
				obj.deleteContact();
				break;
			case 5:
				A=false;
				break;
				}
			
			}
		

	}

}
