import java.util.Arrays;
import java.util.stream.DoubleStream;

class SumArgs {
    public static void main(String[] args) {
        DoubleStream doubleStream = Arrays.stream(args).mapToDouble(Double::parseDouble);
        double sum = doubleStream.sum();
        System.out.println("合計: " + sum);
    }
}
