package chapter7;

public class Director {
    private Builder builder;

    // 依存性の注入(Dependency Injection: DI)
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的なあいさつ");
        builder.makeItems(new String[] {"How are you?", "Hello.", "Hi."});
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[] {"Good morning.", "Good afternoon.", "Good evening."});
        builder.close();
    }
}
