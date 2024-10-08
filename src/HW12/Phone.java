package HW12;

public class Phone {
    public static void connect(WiredHeadphones wh){
        System.out.println(wh.getType() + " headphone " + wh.getMaker() + " " + wh.getModel() +  " connected");
    }

    public static void connect(WirelessHeadphones wr){
        System.out.println(wr.getType() + " headphone " + wr.getMaker() + " " + wr.getModel() +  " connected");
    }
}
