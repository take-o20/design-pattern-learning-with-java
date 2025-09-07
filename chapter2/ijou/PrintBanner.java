package chapter2.ijou;

public class PrintBanner extends Print {
    // 委譲しているパターン（インスタンスを生成している）
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
