package chapter5.ex3;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("インスタンスを生成しました。");
        slowdown();
    }

    // public static Singleton getInstance() {
    // // ここの条件がスレッドセーフではない
    // if (singleton == null) {
    // singleton = new Singleton();
    // }
    // return singleton;
    // }

    public static synchronized Singleton getInstance() {
        // ここの条件がスレッドセーフではない
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}

// 複数スレッドから呼び出されるとSingletonパターンにならない
// 回答：synchronized 修飾子を付けてないから
// 解答：
// 複数のスレッドからほぼ同時にgetInstanceメソッドが呼ばれた時に、複数のインスタンスが生成されてしまう可能性があるから
