package chapter7;

import java.io.*;

public class MDBuilder extends Builder {
    private String filename = "untitled.md";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".md";
        sb.append("# " + title + "\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append(str + "\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("\n");
        for (String item : items) {
            sb.append("* ").append(item).append("\n");
        }
        sb.append("\n\n");
    }

    @Override
    public void close() {
        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMDResult() {
        return filename;
    }
}
