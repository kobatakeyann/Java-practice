import java.util.HashMap;
import java.util.Map;

class MapUse {
    public static void main(String[] args) {
        // HashMapの利用
        Map<String, Integer> fruitsPrice = new HashMap<>();
        fruitsPrice.put("apple", 240);
        fruitsPrice.put("banana", 80);
        fruitsPrice.put("grape", 200);
        System.out.println(fruitsPrice);
        // value取得
        System.out.println(fruitsPrice.get("apple"));
        // key検索
        System.out.println(fruitsPrice.containsKey("apple"));
        // ループ取り出し
        for (String key : fruitsPrice.keySet()) {
            System.out.printf("fruit: %-6s, price: %3d円\n", key, fruitsPrice.get(key));
        }
    }
}
