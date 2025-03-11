import java.util.ArrayList;
import java.util.List;

class ListUse {
    public static void main(String[] args) {
        // ArrayListの利用
        List<String> fruits = new ArrayList<>(); // 右辺のジェネリクスは省略可
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);
        System.out.println(fruits.contains("orange")); // in検索
        System.out.println(fruits.get(0)); // 取り出し
    }
}
