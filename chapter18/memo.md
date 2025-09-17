# Memento

* memento
  * 思い出の種、形見、記念品
* カプセル化の破壊
  * 本来閉じてあるべきものを開放しすぎて、それの内部構造に依存した実装があらゆる場所にされてしまい、その結果修正が困難になること。

mementoパターンでは以下のことができるようになる。

* undo: やり直し
* redo: 再実行
* history: 作業履歴の作成
* snapshot: 現在状態の保存

## 所感

* p293
  * narrow interface と wide interface についてしっくりこない
    * wideインターフェースの関数は、mementoの状態を変えられるから、できる仕事の幅が広いという意味でのwideなのか？
    * 逆にnarrowは外部からアクセスできても、できる仕事の範囲は狭いから？
    * p295に答えが書いてあった


## 練習問題18-1

Gameの状態に関係なくmementoの状態を変えられてしまう可能性がある


## 練習問題18-2

* ファイルに保存する


## 練習問題18-3

```java
private int number;

int getNumber() {
  return number;
}

private void setNumber(int num) {
  this.number = num;
}
```

