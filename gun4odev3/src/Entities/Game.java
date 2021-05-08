package Entities;

import Abstract.IEntity;

public class Game implements IEntity
{
  int GameID;
  String GameName, Creator, Platform;
  int Price;
  
  
public Game(int gameID, String gameName, String creator, String platform, int price) {
	
	setGameID(gameID);
	setGameName(gameName);
	setCreator(creator);
	setPlatform(platform);
	setPrice(price);
	
}



public int getGameID() {
	return GameID;
}


public void setGameID(int gameID) {
	GameID = gameID;
}


public String getGameName() {
	return GameName;
}


public void setGameName(String gameName) {
	GameName = gameName;
}


public String getCreator() {
	return Creator;
}


public void setCreator(String creator) {
	Creator = creator;
}


public String getPlatform() {
	return Platform;
}


public void setPlatform(String platform) {
	Platform = platform;
}


public int getPrice() {
	return Price;
}


public void setPrice(int price) {
	Price = price;
}	
	
	
	
	
	
	
	
	
}
