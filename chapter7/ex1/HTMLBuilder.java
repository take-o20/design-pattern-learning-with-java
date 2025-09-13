package chapter7.ex1;

import java.io.*;

public class HTMLBuilder implements Builder {
    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>").append(title).append("</title></head><body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>").append(str).append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>");
        for (String item : items) {
            sb.append("  <li>").append(item).append("</li>\n");
        }
        sb.append("</ul>\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>");
        sb.append("</html>\n");

        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return filename;
    }
}
