package chapter6.ex2.framework;

public interface Product extends Cloneable {
    public abstract void use(String a);

    public abstract Product clone();
}
