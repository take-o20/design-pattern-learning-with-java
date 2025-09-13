package chapter6.ex2ans;

import chapter6.ex2ans.framework.Manager;
import chapter6.ex2ans.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        MessageBox qbox = new MessageBox('?');

        // 登録
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        manager.register("question box", qbox);

        // 生成と使用
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

        Product p4 = manager.create("question box");
        p4.use("Hello, world.");
    }
}
