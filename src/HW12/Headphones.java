package HW12;
//Абстрактный класс Headphones, который знает марку/модель наушников
public abstract class Headphones {
    String maker;
    String model;

    public Headphones(String maker, String model){
        this.maker = maker;
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }
}
