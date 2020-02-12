package com.cag.lab2;
import java.util.*;

public class InterfaceValidation {
	public interface Sup
	{
	    boolean Supp(String user,String password);
	    
	}

	public static void main(String args[])
	{
		
		
		Sup s= ( user,  password)->{ 
			Scanner s1 = new Scanner(System.in);
			 System.out.print("Enter user name");
			 user = s1.next();
			 System.out.print("Enter password");
			 password = s1.next();
	    	
			
			 String  userid="user";
			String   passid = "supper";
			    	 if (user.equals(userid) && password.equals(passid))
 		return  true;
			    	 else
			    		
					return false;
		};
			    	 System.out.println(s.Supp(" user","passw "));
					
			    	 
			    	 
	}
			
		
	}	

	

		
			


