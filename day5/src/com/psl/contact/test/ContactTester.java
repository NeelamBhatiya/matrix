package com.psl.contact.test;

import com.psl.contact.Address;
import com.psl.contact.Contact;

public class ContactTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Pura", "Indore", "456006", "M.P,","India");
		Contact c = new Contact("N", "", "Bhatiya", "19/06/1997", "Female","Dont know", address, "123456", "9876543210", "neelamb113gmail.com", "abc.com");
		try{
			c.validate();
				//throw new Exception("Error");
			
		}
		catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("Exc "+e.getMessage());
		}
		
	}

}
