import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.LongStream;

class ProcessingSpeed {
    public static void main(String[] args) {
        long[] primitiveNumbers = LongStream.iterate(1L, i -> i + 1L).limit(10_000_000L).toArray();
        Long[] wrapperClassNumbers =
                LongStream.iterate(1L, i -> i + 1L).limit(10_000_000L).boxed().toArray(Long[]::new);
        long sum = 0L;
        LocalDateTime start, end;
        long proccesingTime;
        // プリミティブ型(long)
        start = LocalDateTime.now();
        for (long i : primitiveNumbers) {
            sum += i;
        }
        end = LocalDateTime.now();
        proccesingTime = Duration.between(start, end).toMillis();
        System.out.println("long型の処理時間: " + proccesingTime + "ミリ秒");
        // ラッパークラス(Long)
        start = LocalDateTime.now();
        for (long i : wrapperClassNumbers) {
            sum += i;
        }
        end = LocalDateTime.now();
        proccesingTime = Duration.between(start, end).toMillis();
        System.out.println("Long型の処理時間: " + proccesingTime + "ミリ秒");
    }
}
