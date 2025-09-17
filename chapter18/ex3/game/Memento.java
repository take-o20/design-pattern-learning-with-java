package chapter18.ex3.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money; // 所持金
    private List<String> fruits; // フルーツ
    private int number;

    // 所持金を得る(narrow interface)
    public int getMoney() {
        return money;
    }

    int getNumber() {
        return number;
    }

    private void setNumber(int num) {
        this.number = num;
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
}
