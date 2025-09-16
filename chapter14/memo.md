# Chain of Responsibility

責任のたらい回し

## 所感

* 責任のたらい回しという言葉を聞くと、悪い印象を受けた
  * 逆に言えば、
    * 各オブジェクトは自分の仕事に集中できる
    * クライアントは処理の詳細を知らなくていい
      * 部品化しやすい
* よく理解できたと思う。

## 練習問題14-1

コンポーネントの抽象クラスに「next」を定義する。❓

### 解答

コンポーネントが載っている親コンポーネントが「next」になる場合が多いでしょう。

## 練習問題14-2

* protected: 同一パッケージまたはサブクラスから参照可能。

### 回答

resolveメソッドは同一パッケージやサブクラスからだけ参照できるようにし、クライアント側から呼ばれないようにしている。
一方、supportは公開しているので、外から使う時は、supportを呼び出して欲しいという意図が表現されている。

### 解答

## 練習問題14-3

### 回答

```java
public void support(Trouble trouble) {
    if (resolve(trouble)) {
        done(trouble);
        return;
    }
    Support ne = next;
    while (ne != null) {
        if (ne.resolve(trouble)) {
            ne.done(trouble);
            return;
        } else {
            ne = ne.next;
        }
    }
    fail(trouble);
}
```

### 解答

* 所感
  * 初めにobjにthisを入れればいいのか

```java
public void support(Trouble trouble) {
    for (Support obj = this; true; obj = obj.next){
        if (obj.resolve(trouble)){
            obj.done(trouble);
            break;
        } else if(obj.next == null){
            obj.fail(trouble);
            break;
        }
    }
}
```

