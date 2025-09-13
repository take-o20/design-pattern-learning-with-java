package chapter5;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        // コンストラクタをprivateにすることで外部からの呼び出しを禁止している
        System.out.println("インスタンスを生成しました。");
    }

    public static Singleton getInstance() {
        // static Factory Method
        return singleton;
    }
}
