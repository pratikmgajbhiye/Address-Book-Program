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
	
	public void displayContact() {
		 System.out.print(contact);
	}
	
	public void editContacts() {
		System.out.println("Enter the First Name of a person to edit:");
		String name = sc.nextLine();

		if (name.equalsIgnoreCase(contact.getFirstname())) {
			addContacts();
		} else {
			System.out.println("\nPlease Enter Valid Firstname: ");
		editContacts();}

	}
	
	public void deleteContact() {
		System.out.println("\nEnter the Firstname of User to Delete:");
		String name = sc.nextLine();

		if (name.equalsIgnoreCase(contact.getFirstname())) {
			System.out.println("Do You Want to Delete Contact ?");
			System.out.println("Enter Y/N to Delete ");
			String op = sc.nextLine();

			if (op.equals("Y") || op.equals("y")) {
				
				contact = null;
				System.out.println("Contact is Deleted ");}
			else
				System.out.println("Thank you");
		}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}