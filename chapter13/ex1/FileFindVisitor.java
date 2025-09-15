package chapter13.ex1;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {
    // 拡張子
    private String extension = "";
    private List<File> files = new ArrayList<>();

    public FileFindVisitor(String extension) {
        this.extension = extension;
    }

    // File訪問時
    @Override
    public void visit(File file) {
        if (file.getName().endsWith(extension)) {
            files.add(file);
        }
    }

    // Directory訪問時
    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }

    public List<File> getFoundFiles() {
        return files;
    }
}
