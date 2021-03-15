package mobilephones;

public class MobilePhone {
    //DRIVER CLASS
    public static void main(String[] args) {
        MobilePhoneV3 samsungGalaxy = new MobilePhoneV3();
        samsungGalaxy.call();
        samsungGalaxy.sendSms();
        samsungGalaxy.sendMms();
        samsungGalaxy.clickPhotos();
    }
}
