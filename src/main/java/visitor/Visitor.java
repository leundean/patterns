package visitor;

public class Visitor {

    public Visitor() {}

    public void peelOrange(Orange orange){
        orange.setPeel(false);
    }

    public void setAppleColor(Apple apple, String color){
        apple.setColor(color);
    }

    public void setApplePrice(Apple apple){
        apple.setPrice(4.00);
    }

    public void setOrangePrice(Orange orange, Double price){
        orange.setPrice(price);
    }

}
