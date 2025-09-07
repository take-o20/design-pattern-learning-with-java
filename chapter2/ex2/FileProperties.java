package chapter2.ex2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    public FileProperties() {
        super();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        Reader reader = new FileReader(filename);
        this.load(reader);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(filename);
        this.store(writer, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.getProperty(key, "");
    }
}
