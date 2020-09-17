package com.psl.contact;

import com.psl.contact.exception.EmailNotUniqueException;
import com.psl.contact.exception.InvalidInformationException;
import com.psl.training.exception.InvalidParameterRangeException;

class Address{
	String area;
	String city;
	String pincode;
	String state;
	
	String country;
	
	Address(String area,String city,String pincode,	String state,String country){
		this.area=area;
		this.city=city;
		this.country=country;
		this.pincode=pincode;
		this.state=state;
		
	}
	
}

public class Contact {
	String firstName;
	String middleName;
	String lastName;
	String dateOfBirth;
	 String gender;
	 String anniversary; 
	 Address address;
	 String telephoneNumber;
	 String mobileNumber;
	 String email;
	 String website;
	 Contact(String firstName,	String middleName,	String lastName,		String dateOfBirth,
		 String gender,	 String anniversary, 		 Address address,		 String telephoneNumber,
		 String mobileNumber,	 String email,		 String website)
	 {
		 this.address=address;
		 this.anniversary=anniversary;
		 this.dateOfBirth=dateOfBirth;
		 this.email=email;
		 this.firstName=firstName;
		 this.middleName=middleName;
		 this.lastName=lastName;
		 this.mobileNumber=mobileNumber;
		 this.telephoneNumber= telephoneNumber;
		 this.gender=gender;
		 this.website=website;
		 
		 
	 }
	 public String getFirstName() {
		 return this.firstName;
	 }
	 public String getLastName() {
		 return this.lastName;
	 }
	 public void validateEmail(String email) throws EmailNotUniqueException {
	        if (Contact.contains(email)) {
	            throw new EmailNotUniqueException("Email Already Registered");
	        }
	    }
	 
	 
	public void validate() throws InvalidInformationException
	 {
		try {
			if(this.getFirstName()==null ||this.getLastName()==null  )
			{
				throw new Exception("Some  ");
			}
			
			
		}catch(Exception e) {
			InvalidInformationException nex= new InvalidInformationException();			//LOGGING
	
			nex.initCause(e.getCause()); //tell what is the reason of exception
				throw nex;
		}
		
//		
//		try {
//			if(y==0)
//				throw new Exception("Some  ");
//			result = x/y;
//		}catch (Exception e) {
//			logger.info("There is an ex  "+e.getMessage());  //logging on console
//			//throw e; //rethroewing ex for further communication 
//			InvalidParameterRangeException nex= new InvalidParameterRangeException();			//LOGGING
//			
//			nex.initCause(e.getCause()); //tell what is the reason of exception
//			throw nex;
//			//System.out.println("ohh some err");
//			//e.printStackTrace();
//		}		
		
//		 try {
//	            service.validateEmail("abc@gmail.com");
//	        } catch (EmailNotUniqueException e) {
//	            // logging and handling the situation
//	        }
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c = new Contact(Neelam, , Bhatiya, anniversary, anniversary, anniversary, address, anniversary, anniversary, anniversary, anniversary);
		c.validate();
        

	}

}
