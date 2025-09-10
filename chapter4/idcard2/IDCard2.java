package chapter4.idcard2;

import chapter4.framework.Product;

public class IDCard2 extends Product {
    private String owner;
    private Integer serialNumber;

    IDCard2(String owner, Integer serialNumber) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    @Override
    public String toString() {
        return "[IDCard(" + serialNumber + "): " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
