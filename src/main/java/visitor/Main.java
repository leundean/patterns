package visitor;

public class Main {

    public static void main(String[] args) {


        // Create the objects and let them have their own original properties
        // Remember to include an "accept" method for a visitor

        Apple apple = new Apple();
        Orange orange = new Orange();

        // Show original properties
        print("BEFORE");
        print("Orange - prize: " + orange.getPrice() + " peel: " + orange.isPeel() + " seedless: " + orange.isSeedless());
        print("Apple - prize: " + apple.getPrice() + " color: " + apple.getColor() + " ");


        // Create the visitor and let it visit for "resetting properties" by invoking each object's accept method
        Visitor visitor = new Visitor();
        apple.accept(visitor);
        orange.accept(visitor);

        // Show properties after visitor visits
        print("AFTER");
        print("Orange - prize: " + orange.getPrice() + " peel: " + orange.isPeel() + " seedless: " + orange.isSeedless());
        print("Apple - prize: " + apple.getPrice() + " color: " + apple.getColor() + " ");

    }

    public static void print(String line){
        System.out.println(line);
    }
}
