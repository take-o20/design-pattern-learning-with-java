package chapter4.idcard2;

import java.util.HashMap;
import java.util.Map;
import chapter4.framework.Factory;
import chapter4.framework.Product;

public class IDCardFactory2 extends Factory {
    private Map<Integer, String> ownerTable = new HashMap<>();

    @Override
    protected Product createProduct(String owner) {
        IDCard2 card = new IDCard2(owner, ownerTable.size() + 1);
        ownerTable.put(card.getSerialNumber(), card.getOwner());
        return card;
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
}
