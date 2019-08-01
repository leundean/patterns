package observable;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PCLObservable observable = new PCLObservable();
        PCLObserver observer = new PCLObserver();

        observable.addPropertyChangeListener(observer);
        observable.setGreeting("heya");

        System.out.println(observer.getGreeting());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your greeting: ");
        observable.setGreeting(scanner.nextLine());

        System.out.println("I 'observed' your greeting '" + observer.getGreeting() + "'");
    }
}