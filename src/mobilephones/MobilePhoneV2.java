package mobilephones;

public abstract class MobilePhoneV2 extends MobilePhoneV1{
    @Override
    public void sendSms() {
        System.out.println("Sending SMS");
    }

    public abstract void sendMms(); //for Future Version
    public abstract void clickPhotos(); ////for Future Version
}