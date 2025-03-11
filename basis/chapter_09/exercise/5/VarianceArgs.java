import java.util.Arrays;
import java.util.stream.DoubleStream;

class VarianceArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please execute with one or more arguments of float.");
            return;
        }
        DoubleStream doubleStream = Arrays.stream(args).mapToDouble(Double::parseDouble);
        Double average = doubleStream.average().getAsDouble();
        double[] doubleArray = Arrays.stream(args).mapToDouble(Double::parseDouble).toArray();
        double deviationSum = 0;
        for (double i : doubleArray) {
            deviationSum += Math.pow(average - i, 2);
        }
        double variance = deviationSum / doubleArray.length;
        System.out.println("分散: " + variance);
    }
}
