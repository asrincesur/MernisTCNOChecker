package Adapter;

import java.rmi.RemoteException;

import Abstract.IUserCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.*;

public class MerniceServiceAdapter implements IUserCheckService
{

    @Override
    public boolean CheckRealPerson(Player obj) {
       
    	
    
    		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
    		  long tece = Long.parseLong(obj.getNationalityID());
            
          try {
			return  client.TCKimlikNoDogrula(tece,obj.getFirstName().toUpperCase(),obj.getLastName().toUpperCase(),obj.getBirthDate().getYear());
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
    
  
    		
    	return false;
    	
    
    
    }
}
