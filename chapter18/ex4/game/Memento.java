package chapter18.ex4.game;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money; // 所持金
    private List<String> fruits; // フルーツ

    // 所持金を得る(narrow interface)
    public int getMoney() {
        return money;
    }

    // コンストラクタ(wide interface)
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // フルーツを追加する(wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // フルーツを得る(wide interface)
    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

    public static boolean saveToFile(String filename, Memento memento) {
        try {
            Writer writer = new FileWriter(filename);
            writer.write(Integer.toString(memento.money));
            writer.write('\n');
            for (String fruit : memento.fruits) {
                writer.write(fruit + '\n');
            }
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Memento loadFromFile(String filename) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filename), StandardCharsets.UTF_8);
            Memento m = new Memento(Integer.parseInt(lines.get(0)));
            if (lines.size() > 1) {
                for (int i = 1; i < lines.size(); i++) {
                    m.addFruit(lines.get(i));
                }
            }
            return m;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
