import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StreamUse {
    public static void main(String[] args) {
        List<String> sampleStrings =
                Arrays.asList("apple", "banana", "carrot", "fruit", "item", "cat");
        List<Integer> sampleNumbers = Arrays.asList(5, 3, 12, 7, 9, 2, 4);
        // mapメソッド
        sampleStrings.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        // filterメソッド
        List<Integer> aboveSix =
                sampleNumbers.stream().filter(i -> i > 6).collect(Collectors.toList());
        System.out.println(aboveSix);
        // プリミティブ型を扱うStream
        Long countOffactorOf17 = IntStream.range(0, 100).filter(i -> i % 17 == 0).count();
        System.out.println(countOffactorOf17);
        // limitメソッド
        IntStream.generate(() -> new Random().nextInt()).limit(10)
                .forEach(i -> System.out.println(i));
    }
}
