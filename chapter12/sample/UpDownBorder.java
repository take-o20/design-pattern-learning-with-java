package chapter12.sample;

public class UpDownBorder extends Border {
    private char borderChar; // 飾り文字

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        // 行数は中身の行数に上下の飾り文字分を加えたもの
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) { // 上端の枠
            return makeLine(borderChar, display.getColumns());
        } else if (row == display.getRows() + 1) { // 下端の枠
            return makeLine(borderChar, display.getColumns());
        } else { // それ以外
            return display.getRowText(row - 1);
        }
    }

    // 文字chをcount個連続させた文字列を作る
    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
