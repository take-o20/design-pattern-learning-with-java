package chapter9.sample;

import java.util.Random;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

    // 練習問題9-1
    // RandomCoundDisplayに分ける。（機能の追加）
    // public void randomDisplay(int times) {
    // Random rand = new Random();
    // int num = rand.nextInt(times);
    // open();
    // // multiDisplay関数を使い回せる
    // for (int i = 0; i < num; i++) {
    // print();
    // }
    // close();
    // }
}

