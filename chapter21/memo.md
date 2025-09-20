# Proxy

* 意味：代理人

## 登場人物

* Subject: ProxyとRealSubjectを同一視するためのインターフェース（API）を定める。
* Proxy: 代理人
* RealSubject: 実働している人
* Client: Proxyを利用する人

## 要点

ClientとRealSubjectの間に入って、RealSubjectの代理人としての役割を果たすのがProxyである。

ProxyはRealSubjectと同じように扱える特性、すなわち透過性を有する。透過性を実現する役割をSubjectが担っている。

## 所感

* よく理解できたと思う
  * 構成：client - proxy - real subject
  * proxyとreal subject間は、共通のインターフェースsubjectで、透過性を実現している。
* リフレクションの勉強になった

## 問題21-2
⭕️
PrinterProxyの名前を変えた時に、
前の名前のインスタンスの生成が終わっていなかった場合に、
出力される文字列が、前の名前ではなく、最新の名前になってしまう。

0秒: 名前A
1秒: 初期化中、名前Bに変更
2...5秒: 初期化中
6秒: print実行。使われるのは名前B。

### 別解（簡潔に言うと）

PrinterクラスとPrinterProxyクラスのnameの値にズレが生じる。


