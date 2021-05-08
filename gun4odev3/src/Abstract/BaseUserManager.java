package Abstract;

import Entities.Player;
import DataBases.*;


public abstract class BaseUserManager implements IUserService
{

	public void Enroll(Player obj) throws Exception 
	{
		
		System.out.println("Enrolled:"+ obj.getFirstName()+" "+obj.getLastName());
		UsersDB.Users.add(obj);
		
		
	}
		
	
	
	
	
	
	public void DeleteAccount(Player obj) 
	{
		System.out.println("Deleted:"+ obj.getFirstName()+" "+obj.getLastName());
		UsersDB.Users.remove(obj);
	}
		
	
	
	
	
	public void Update(Player obj)  
	{
		System.out.println("Will Be Updated:"+ obj.getFirstName()+" "+obj.getLastName());
		
		//this part is not efficient, i had no enough time to complete, so i just wanted work on it  much;
		Player Changed = null;
		UsersDB.Users.set(UsersDB.Users.indexOf(obj),Changed);
	}
	
	
	
	
	
	
	
	
	
	
	
}
