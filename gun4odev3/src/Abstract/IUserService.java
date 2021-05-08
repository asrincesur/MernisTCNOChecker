package Abstract;
import Entities.Player;


public interface IUserService 
{

	public void Enroll(Player obj) throws Exception  ;
	public void DeleteAccount(Player obj) ;
	public void Update(Player obj)  ;
		
	
}
