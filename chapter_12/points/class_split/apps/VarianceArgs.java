package chapter_12.points.class_split.apps;

import chapter_12.points.class_split.utils.ArrayOperations;

public class VarianceArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please execute with arguments of float.");
            return;
        }
        double[] nums = ArrayOperations.convertToDoubleNums(args);
        double sum = ArrayOperations.getSum(nums);
        double average = sum / nums.length;
        double squareDeviationSum = 0.0d;
        for (double i : nums) {
            squareDeviationSum += Math.pow(i - average, 2);
        }
        double variance = squareDeviationSum / nums.length;
        System.out.printf("分散: %s\n", variance);
    }
}
