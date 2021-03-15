package mobilephones;

public class MobilePhoneV3 extends MobilePhoneV2{
    @Override
    public void sendMms() {
        System.out.println("Sending MMS!");
    }

    @Override
    public void clickPhotos() {
        System.out.println("Clicking Photos!");
    }
}
