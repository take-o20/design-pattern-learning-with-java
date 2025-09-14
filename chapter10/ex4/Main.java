package chapter10.ex4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // https://docs.oracle.com/javase/jp/8/docs/api/java/util/Arrays.html#sort-T:A-int-int-java.util.Comparator-:~:text=%E3%81%8C%E3%81%82%E3%82%8B%E5%A0%B4%E5%90%88%E3%80%82-,sort,-public%20static%C2%A0%3CT
        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)

        // 無名クラス版
        // 辞書式順序で小さい順
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
        System.out.println(list);

        // 辞書式順序で大きい順
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return -1 * str1.compareTo(str2);
            }
        });
        System.out.println(list);


        // ラムダ式版
        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);

        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
