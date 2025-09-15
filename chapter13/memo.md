# Visitor

「訪問者」

Visitorパターンでは、データ構造と処理を分離します。
そして、データ構造の中を巡り歩く主体である「訪問者」を表すクラスを用意し、そのクラスに処理をまかせます。
すると、新しい処理を追加したい時には新しい訪問者を作れば良い。


## 所感

* Directoryクラスに`implements Iterable<Entry>`していることで、ListVisitorで以下を実装できているんだなと思った。

```java
for (Entry entry : directory) {
    entry.accept(this);
}
```

  * デザインパターンをしみじみと感じた。Iteratorパターンってしょっちゅう出てくるかも。

* サンプルプログラムはすんなり理解できたと思う
  * 特にダブルディスパッチ(double dispatch：二重の振り分け)の箇所はすんなり理解できた。
* 処理を分離するとあるが、Directory.javaやFile.javaにacceptメソッドが定義されてしまっているのは、良いのか？と思う。
  * それらは外枠だけで、具体的な処理をvisitorに任せているのはそうなのだが。


## memo

* p231
  * The Open-Closed Principle - 拡張については開き、修正については閉じる


## 問題13-4

forEachでループできない
