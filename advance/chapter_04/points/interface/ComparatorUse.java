import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorUse {
    public static void main(String[] args) {
        List<String> sampleArray = new ArrayList<>();
        sampleArray.add("sour");
        sampleArray.add("car");
        sampleArray.add("apple");
        sampleArray.add("banana");
        System.out.println(sampleArray.toString());
        // 1. Collections.sortの第２引数に、Comparatorのメソッド(compare)をラムダ式で実装して渡す
        Collections.sort(sampleArray, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(sampleArray.toString());
        // 2. Arraylikeのsortメソッドの引数に、Comparator.comparingメソッドをメソッド参照を用いて渡す
        sampleArray.sort(Comparator.comparing(String::length));
        System.out.println(sampleArray.toString());
    }
}
