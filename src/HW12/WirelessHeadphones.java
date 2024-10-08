package HW12;

public class WirelessHeadphones extends  Headphones{
    int batteryLife;

    public WirelessHeadphones(String maker, String model, int batteryLife) {
        super(maker, model);
        this.batteryLife = batteryLife;
    }

    public String getType(){
        return "Wireless";
    }
}
