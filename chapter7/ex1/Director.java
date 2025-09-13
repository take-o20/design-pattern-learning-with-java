package chapter7.ex1;

public class Director {
    private Builder builder;

    // 依存性の注入(Dependency Injection: DI)
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("日本食");
        builder.makeString("日本の代表的な料理");
        builder.makeItems(new String[] {"おせち", "もち", "わらび餅"});
        builder.makeString("麺類");
        builder.makeItems(new String[] {"ラーメン", "うどん", "そば"});
        builder.close();
    }
}
