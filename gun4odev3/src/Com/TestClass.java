package Com;

import java.time.LocalDate;

import org.apache.axis.types.Entities;

import Abstract.BaseGameManager;
import Abstract.BaseUserManager;
import Abstract.IOrder;
import Adapter.MerniceServiceAdapter;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.*;
import Decorator.*;

public class TestClass {

	public static void main(String[] args) throws Exception {
		
		 Player ahmet  = new Player(1,"Muhammed Asrın","cesur","asrincesur@gmail.com", LocalDate.of(1998,10,27),"53524665354");
		
		 
		 BaseUserManager UManager = new UserManager(new MerniceServiceAdapter());	     
		 UManager.Enroll(ahmet);
		 
		 Game COD2 = new Game(1,"Call of Duty 2", "Infinity Ward", "PC", 100);
		 
		 BaseGameManager GManager = new GameManager();
		 GManager.UploadGame(COD2);
		 
		 IOrder _order = new Order(1,ahmet,COD2,LocalDate.now());
		 
		 PriceManager SpecialOffer = new PriceManager(_order, 20);
		 System.out.println(SpecialOffer.Buy(COD2)); 
	}

}
