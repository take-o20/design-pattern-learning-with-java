package chapter13.ex2;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
