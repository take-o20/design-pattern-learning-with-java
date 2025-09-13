package chapter9.sample;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        RandomCountDisplay d5 = new RandomCountDisplay(new StringDisplayImpl("Hello, Universe."));
        d5.randomDisplay(10);

        Display d4 = new Display(new TextFileDisplayImpl("chapter9/memo.md"));
        d4.display();

        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d6.increaseDisplay(4);
        d7.increaseDisplay(6);
    }
}
