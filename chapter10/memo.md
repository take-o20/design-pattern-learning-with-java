# Strategy

Strategy: 戦略

Strategyパターンでは、実装したアルゴリズムをごっそりと交換できるようになっています。


## 乱数生成器 p158

* java.util.Random
  * スレッドセーフ
  * 性能はThreadLocalRandomの方がよい
  * セキュリティに使ってはだめ
* java.util.concurrent.ThreadLocalRandom
  * スレッドセーフ
  * セキュリティに使ってはだめ
* java.security.SecureRandom
  * 暗号学的に強い乱数生成器で、セキュリティ用途で使われる
  * スレッドセーフ

## 所感

* 似たようなパターンを見かけたような気がすると思った。完全に整理できていない。
* 文脈は自由にクライアントが決めることができるって感じかな。
  * Abstract Factoryと対比するのが良いかな？


## 演習問題
### 10-2

Enumにはequalsメソッドが定義されており、それが使われるから。❌

* https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Enum.html


#### 解答

Hand型のインスタンス（enum定数）は、もともと（ROCK、SCISSORS、PAPER）の３つしか存在しないことが保証されているから。

※ javaでEnum型は必ずシングルトンとなる！

### 10-3

デフォルトでfalseだから。🔺

#### 解答

Javaでは、明示的に初期化されていないフィールドは、自動的に初期化されるから。
boolean型のフィールドはfalse、数は0、参照型はnullで初期化される。


