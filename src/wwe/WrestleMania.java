package wwe;

public abstract class WrestleMania {
    static final int PERHOURPAY = 1200;
    public void salary(int hours){
        System.out.println("The Payment by hour is: " + (hours * PERHOURPAY));
    }
    public abstract String entryMusic();
}
