package Concrete;

import Abstract.BaseUserManager;
import Abstract.IUserCheckService;
import Entities.Player;

public class UserManager extends BaseUserManager
{

	
	IUserCheckService _IUserCheckService ;
		
		public UserManager(IUserCheckService _IUserCheckService) {
		
		this._IUserCheckService = _IUserCheckService;
	}


	
	
	@Override
	public void Enroll(Player obj) throws Exception {
		 if(_IUserCheckService.CheckRealPerson(obj) ){
	            super.Enroll(obj);
	        }
	        else
	        {
	            throw new Exception("Not existing person");
	        }
	}
	

	
	@Override
	public void DeleteAccount(Player obj) {
		// TODO Auto-generated method stub
		super.DeleteAccount(obj);
	}

	@Override
	public void Update(Player obj) {
		// TODO Auto-generated method stub
		super.Update(obj);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
