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


// クラスの分割
class ArrayOperations {
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
