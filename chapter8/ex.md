# 練習問題

## 8-1

* 良い点
  * 意図しない更新を防げる
* 悪い点
  * サブクラスからtrayの状態がわからない

### 解答

* 良い点
  * Trayのサブクラスが、trayフィールドの実装に依存したコードにならない
* 悪い点
  * 適切なアクセス用のメソッドを新たに作成する必要が生じること

## 8-2

* ListFactoryにcreateYahooPageを定義❌

### 解答

Factory.javaとMain.java

## 8-3

* ListFactoryのcreateLinkでインスタンス化する必要があるから🔺

### 解答

Javaではコンストラクタは継承されないから。→ サブクラスでnew XXXのように呼び出せない。


## 8-4

* PageクラスはItemクラスではないから。

### 解答

PageはTrayにaddすることはできないから。


