package chapter12.sample;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
                new FullBorder(new FullBorder(
                        new SideBorder(new FullBorder(new StringDisplay("Hello, world.")), '*'))),
                '/');
        b4.show();

        Display a1 = new StringDisplay("Hello, world.");
        Display a2 = new UpDownBorder(a1, '-');
        Display a3 = new SideBorder(a2, '*');
        a1.show();
        a2.show();
        a3.show();
        Display a4 =
                new FullBorder(new UpDownBorder(
                        new SideBorder(new UpDownBorder(
                                new SideBorder(new StringDisplay("Hello, world."), '*'), '='), '|'),
                        '/'));
        a4.show();


        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hi!");
        md.add("Good Morning.");
        md.add("Good night!");
        md.show();

        Display c1 = new SideBorder(md, '#');
        c1.show();
        Display c2 = new FullBorder(md);
        c2.show();
    }
}
