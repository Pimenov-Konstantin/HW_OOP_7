public class Main {
    public static void main(String[] args) {


        CellPhone Nokia1413 = new CellPhone(1998, "1413", 24, "SSymbian OS");
        Landlinephone landlinephone = new Landlinephone(2010, "12P", "Disc");
        Smartphone samsung121 = new Smartphone(2020, "Galaxy A22", 48, "Android 5.0", "1280*720", 1024, 1024);

        Nokia1413.call();
        Nokia1413.sendSMS();

        landlinephone.sendFax();
        landlinephone.call();

        samsung121.call();
        samsung121.internet();
        samsung121.sendSMS();
        samsung121.sendEmail();

    }
}