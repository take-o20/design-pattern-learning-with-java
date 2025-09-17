package chapter17.ex1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncreaseNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
