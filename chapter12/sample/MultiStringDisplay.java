package chapter12.sample;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> strs = new ArrayList<>();

    public MultiStringDisplay() {}

    @Override
    public int getColumns() {
        int maxLength = 0;
        for (String s : strs) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }

    @Override
    public int getRows() {
        return strs.size();
    }

    @Override
    public String getRowText(int row) {
        int maxLength = getColumns();
        String s = strs.get(row);
        return s + whiteSpace(maxLength - s.length());
    }

    public void add(String str) {
        strs.add(str);
    }

    private String whiteSpace(int len) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < len; i++) {
            line.append(" ");
        }
        return line.toString();
    }
}
