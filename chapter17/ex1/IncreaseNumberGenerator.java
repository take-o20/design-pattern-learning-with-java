package chapter17.ex1;

public class IncreaseNumberGenerator extends NumberGenerator {
    private int begin;
    private int end;
    private int inclement;
    private int currentNumber;

    public IncreaseNumberGenerator(int begin, int end, int inclement) {
        this.begin = begin;
        this.end = end;
        this.inclement = inclement;
    }

    // 数を取得する
    @Override
    public int getNumber() {
        return currentNumber;
    }

    // 数を生成する
    @Override
    public void execute() {
        for (int i = begin; i < end; i += inclement) {
            currentNumber = i;
            notifyObservers();
        }
    }
}
