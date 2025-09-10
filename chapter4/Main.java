package chapter4;

import chapter4.framework.Factory;
import chapter4.framework.Product;
import chapter4.idcard2.IDCardFactory2;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory2();
        Product card1 = factory.create("Hiroshi Yuki");
        Product card2 = factory.create("Tomura");
        Product card3 = factory.create("Hanako Sato");
        card1.use();
        card2.use();
        card3.use();
    }
}
