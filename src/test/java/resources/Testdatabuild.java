package resources;

import com.github.javafaker.Faker;

import pojo.user;


public class Testdatabuild {
	
	static Faker faker;
	static user use;
	
	public static user setupdata(String gender, String status)
	{
		faker = new Faker();
		use = new user();
				
		use.setId(faker.idNumber().hashCode()); 
		use.setName(faker.name().username());
		use.setGender(gender);
		use.setEmail(faker.internet().safeEmailAddress()); 
		use.setStatus(status); 
		return use;
		
		
	}
	
	public static String updatedata()
	{
		String Str = "{\"name\":\"Arun\",\"email\":\"user_mail\",\"status\":\"active\"}";
		return Str;
	}
	
		
}
