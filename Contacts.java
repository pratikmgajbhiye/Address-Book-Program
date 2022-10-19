package com.AddressBookProgram;

public class Contacts {
	
	private static String firstname, lastname, address, city, state, zip, email, phone_no;
	
	public static String getFirstname() {
		return firstname;
	}

	public static void setFirstname(String firstname) {
		Contacts.firstname = firstname;
	}

	public static String getLastname() {
		return lastname;
	}

	public static void setLastname(String lastname) {
		Contacts.lastname = lastname;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		Contacts.address = address;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		Contacts.city = city;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		Contacts.state = state;
	}

	public static String getZip() {
		return zip;
	}

	public static void setZip(String zip) {
		Contacts.zip = zip;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Contacts.email = email;
	}

	public static String getPhone_no() {
		return phone_no;
	}

	public static void setPhone_no(String phone_no) {
		Contacts.phone_no = phone_no;
	}
	
	public Contacts() {
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.email=email;
		this.phone_no=phone_no;
	}
	

	@Override
	public String toString() {
	return "\nfirstName=" + firstname + " " + "\nlastName=" + lastname + " \nAddress=" + address
			+ " \ncity=" + city + " \nstate=" + state + " \nzip=" + zip + " \nphone_no=" + phone_no
			+ " \nemail=" + email ;
	}

}