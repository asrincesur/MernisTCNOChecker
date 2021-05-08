package Abstract;

import Entities.Game;
import DataBases.*;
public abstract class BaseGameManager implements IGameService
{

	@Override
	public void UploadGame(Game obj) {
	
		System.out.println("Game Uploaded: "+ obj.getGameName());
		GameDB.AllGames.add(obj);
	}

	@Override
	public void DeleteGame(Game obj) {
		System.out.println("Game Deleted: "+ obj.getGameName());
		GameDB.AllGames.remove(obj);
		
	}

}
