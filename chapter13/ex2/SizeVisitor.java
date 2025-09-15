package chapter13.ex2;


public class SizeVisitor extends Visitor {
    private int sizeSum = 0;

    // File訪問時
    @Override
    public void visit(File file) {
        sizeSum += file.getSize();
    }

    // Directory訪問時
    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }

    public int getSize() {
        return sizeSum;
    }
}
