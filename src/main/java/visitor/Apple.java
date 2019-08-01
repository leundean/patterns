package visitor;

public class Apple {

    private double price = 3;
    private boolean peel = true;
    private String color = "yellow";

    public Apple() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accept(Visitor visitor){
        visitor.setAppleColor(this, "red");
        visitor.setApplePrice(this);
    }

}
