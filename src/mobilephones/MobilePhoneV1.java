package mobilephones;

public abstract class MobilePhoneV1 {
    public void call(){ //This version can call
        System.out.println("Calling...");
    }
    abstract public void sendSms(); //For future version. So didn't implement it here. Hence made it Abstract.
}