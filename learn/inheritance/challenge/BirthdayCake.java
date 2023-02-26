package inheritance.challenge;

public class BirthdayCake extends Cake{
    protected int candles;

    public BirthdayCake(){
        super();
        this.setFlavor("Choc");
    }
    public int getCandles(){
        return candles;
    }
    public void setCandles(int candles){
        this.candles=candles;
    }
}
