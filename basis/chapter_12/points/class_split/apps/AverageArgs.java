package basis.chapter_12.points.class_split.apps;

import basis.chapter_12.points.class_split.utils.ArrayOperations;

public class AverageArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please execute with arguments of float.");
            return;
        }
        double[] doubleNums = ArrayOperations.convertToDoubleNums(args);
        double sum = ArrayOperations.getSum(doubleNums);
        double average = sum / doubleNums.length;
        System.out.printf("平均: %s\n", average);
    }
}
