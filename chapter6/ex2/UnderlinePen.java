package chapter6.ex2;

import chapter6.ex2.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product clone() {
        return new UnderlinePen(this);
    }


    // コピーコンストラクタ
    public UnderlinePen(UnderlinePen prototype) {
        this.ulchar = prototype.ulchar;
    }
}
