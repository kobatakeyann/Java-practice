package basis.chapter_12.points.class_split.utils;

public class ArrayOperations {
    public static double[] convertToDoubleNums(String[] args) {
        double[] doubleNums = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            doubleNums[i] = Double.parseDouble(args[i]);
        }
        return doubleNums;
    }

    public static double getSum(double nums[]) {
        double sum = 0.0d;
        for (double i : nums) {
            sum += i;
        }
        return sum;
    }
}
