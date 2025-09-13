package chapter5.ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private String name;
    // private static Triple ALPHA = new Triple("ALPHA");
    // private static Triple BETA = new Triple("BETA");
    // private static Triple GAMMA = new Triple("GAMMA");

    // private Triple(String name) {
    // this.name = name;
    // System.out.println("インスタンスを生成しました。");
    // }

    // public static Triple getInstance(String name) {
    // if (ALPHA.name == name) {
    // return ALPHA;
    // }
    // if (BETA.name == name) {
    // return BETA;
    // }
    // if (GAMMA.name == name) {
    // return GAMMA;
    // }
    // return null;
    // }
    private static Map<String, Triple> map = new HashMap<>();
    static {
        String[] names = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
