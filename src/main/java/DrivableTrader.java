
import java.util.List;

public class DrivableTrader extends Trader<Drivable>{

    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable object){
        if(object.getClass() == Tradable){
            return ((Tradable)object).getPrice()+ object.getMaxSpeed();
        }else{
            return Tradable.MISSING_PRICE;
        }
    }


}
