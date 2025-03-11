import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

class AverageArgs {
    public static void main(String[] args) {
        DoubleStream doubleStream = Arrays.stream(args).mapToDouble(Double::parseDouble);
        OptionalDouble average = doubleStream.average();
        System.out.println("平均: " + average.orElse(0));
    }
}
