package wwe;

public abstract class WrestleMania {
    int perHourWage = 1200;
    public void payByHour(int hours){
        System.out.println("The Payment by hour is: " + (hours * perHourWage));
    }
    public abstract String entryMusic();
}
