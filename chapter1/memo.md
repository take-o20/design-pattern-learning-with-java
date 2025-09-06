# Iterator

Iterator: 反復子


## 所感

* クラス図を見て `Iterable<Book>` が `Iterator<Book>` を作っていることに今回初めて気づいた。
  * 現時点ですんなり理解できていない
  * `BookShelf`が`Iterable<Book>`の子クラス、`BookShelfIterator`が`Iterator<Book>`の子クラスという視点で考えると、しっくりきそうかもしれない。
    * 「`BookShelf`は`BookShelfIterator`を集約している」。この視点で考えてみるのもいいかもしれない。

* クラス図を作るのにdraw.ioのvscodeプラグインが便利だと思った。

## words

* 集約（aggregation）
  * あるクラスが自身のフィールドに、その他のクラスを保持しているような関係
