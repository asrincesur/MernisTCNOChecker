package Entities;

import java.time.LocalDate;


import Abstract.IOrder;

public class Order implements IOrder
{
 
 int OrderID;
 Player Customer;
 Game _Game;
 LocalDate BoughtDate;

 
 
 public Order(int orderID, Player customer, Game _Game, LocalDate boughtDate) {
	super();
	OrderID = orderID;
	Customer = customer;
	this._Game = _Game;
	BoughtDate = boughtDate;
}
public int getOrderID() {
	return OrderID;
}
public void setOrderID(int orderID) {
	OrderID = orderID;
}
public Player getCustomer() {
	return Customer;
}
public void setCustomer(Player customer) {
	Customer = customer;
}
public Game get_Game() {
	return _Game;
}
public void set_Game(Game _Game) {
	this._Game = _Game;
}
public LocalDate getBoughtDate() {
	return BoughtDate;
}
public void setBoughtDate(LocalDate boughtDate) {
	BoughtDate = boughtDate;
}


@Override
public float Buy(Game game) {
 
	return game.Price;
		
}
 
 
 
}
