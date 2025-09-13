package chapter5.ex;


public enum TripleEnum {
    ALPHA, BETA, GAMMA;

    private TripleEnum() {
        System.out.println("The instance " + this + " is created.");
    }

    public static TripleEnum getInstance(String name) {
        return valueOf(name);
    }
}
