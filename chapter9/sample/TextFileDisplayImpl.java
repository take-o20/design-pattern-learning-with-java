package chapter9.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 練習問題9-2
public class TextFileDisplayImpl extends DisplayImpl {
    private String filepath;

    public TextFileDisplayImpl(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void rawOpen() {}

    @Override
    public void rawPrint() {
        Path path = Paths.get(filepath);
        try {
            String content = new String(Files.readAllBytes(path));
            System.out.println(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void rawClose() {}
}
