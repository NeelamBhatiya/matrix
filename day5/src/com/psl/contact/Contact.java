package com.psl.contact;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import com.psl.contact.exception.InvalidInformationException;




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
	 public Contact(String firstName,	String middleName,	String lastName,		String dateOfBirth,
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
	 static Logger logger =Logger.getLogger(Contact.class.getName());
		static {
			try {
				logger.addHandler(new FileHandler("myLog"));
			} catch (SecurityException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	 public String getFirstName() {
		 return this.firstName;
	 }
	 public String getLastName() {
		 return this.lastName;
	 }
	 String  getDOB() 
	 {
			
			return this.dateOfBirth;
		}
		String getEmail() {
		return this.email;
	}
	 
	public void  validate() throws InvalidInformationException
	 {
		try {
			if(this.getFirstName()==null ||this.getLastName()==null || this.getDOB()==null || this.getEmail()==null )
			{
				
				throw new InvalidInformationException("Dob err");	
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println(this.getDOB());
		try {
			if(Contact.isValid(this.getEmail()) !=true)
			{
				throw new InvalidInformationException("Invalid email");	
			}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("email should be like abc@gmail.com");

		}finally {
			System.out.println("email");
		
		}
//		try {
//			if(this.getMobileN()==null ||this.getLastName()==null || this.getDOB()==null || this.getEmail()==null )
//			{
//				
//				throw new InvalidInformationException("Dob err");	
//			}
//			
//			
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
		System.out.println(this.getDOB());
		
	
	
	 }

	 

//	 boolean isValid(String email) {
//		      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
//		      return email.matches(regex);
//		   }
	 public static boolean isValid(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 
	

	public static void main(String[] args) throws InvalidInformationException {
		// TODO Auto-generated method stub
		
        

	}

}


//	
//	try {
//		if(y==0)
//			throw new Exception("Some  ");
//		result = x/y;
//	}catch (Exception e) {
//		logger.info("There is an ex  "+e.getMessage());  //logging on console
//		//throw e; //rethroewing ex for further communication 
//		InvalidParameterRangeException nex= new InvalidParameterRangeException();			//LOGGING
//		
//		nex.initCause(e.getCause()); //tell what is the reason of exception
//		throw nex;
//		//System.out.println("ohh some err");
//		//e.printStackTrace();
//	}		
	
//	 try {
//            service.validateEmail("abc@gmail.com");
//        } catch (EmailNotUniqueException e) {
//            // logging and handling the situation
//        }
