package Decorator;

import Abstract.IOrder;
import Entities.Game;
import Entities.Order;

public class PriceManager implements IOrder
{

	//bu class yeni kampanya ekleyip çıkarmak için loosly couppled decorator desing pattern çerçevesinde oluşturulmaya çalışılmıştır.
	
	IOrder _Order;
    float Discount;
	
    
    public PriceManager(IOrder _Order, float Discount) {		
		this._Order = _Order;
		this.Discount = Discount;
	}

	@Override
	public float Buy(Game game) {
	
	
		System.out.print("Kampanya fiyatı: ");		
				
		return game.getPrice()-(float)game.getPrice()*(Discount/100);
	}
	
	
	
	
}
