package chapter3;

public interface AbstractDisplayInterface {
    public abstract void open();
    // インターフェースのメソッドにabstractをつけるべきか・つけないべきか
    // インターフェースは「契約（仕様）」を表す仕組みであり、クラスに「必ずこのメソッドを実装してね」ということを宣言するためのもの。
    // したがって、具体的な処理を持たないのが原則でした。つまり、abstract修飾子は不要ではないか。

    public void close();

    public void print();

    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
