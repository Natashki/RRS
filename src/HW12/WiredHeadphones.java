package HW12;

public class WiredHeadphones extends Headphones{
    int cableLength;

    public WiredHeadphones(String maker, String model, int cableLength){
        super(maker, model);
        this.cableLength = cableLength;
    }

    public String getType(){
        return "Wired";
    }
}
