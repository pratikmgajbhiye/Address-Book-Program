package com.AddressBookProgram;

import java.util.Scanner;
public class AdderssBook {
	
	Contacts contact;
	Scanner sc =new Scanner(System.in);
	public void addContacts() {
		contact=new Contacts();
		System.out.println("Enter the First Name : ");
		String firstname=sc.nextLine();
		
		System.out.println("Enter the Last Name : ");
		String lastname=sc.nextLine();
		
		System.out.println("Enter the Adderss : ");
		String address=sc.nextLine();
		
		System.out.println("Enter the City : ");
		String city=sc.nextLine();
		
		System.out.println("Enter the State : ");
		String state=sc.nextLine();
		
		System.out.println("Enter the Zipcode : ");
		String zip=sc.nextLine();
		
		System.out.println("Enter the Email ID : ");
		String email=sc.nextLine();
		
		System.out.println("Enter the Phone No : ");
		String phone_no=sc.nextLine();
		
		contact.setFirstname(firstname);
        contact.setLastname(lastname);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhone_no(phone_no);
        contact.setEmail(email);
        
        System.out.print(contact);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}