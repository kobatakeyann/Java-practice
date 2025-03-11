class SquareRoot {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of positive number.");
            return;
        }
        double targetNum = Double.parseDouble(args[0]);
        if (targetNum < 0) {
            System.out.println("Please provide a non-negative number.");
            return;
        }
        final double tolerance = 0.00000000001;
        double leftEdge = (targetNum > 1) ? 1.0 : targetNum;
        double rightEdge = (targetNum > 1) ? targetNum : 1.0;
        double approximateRoot, deviation;
        do {
            approximateRoot = (leftEdge + rightEdge) / 2.0;
            deviation = Math.abs(Math.pow(approximateRoot, 2) - targetNum);
            if (deviation < tolerance) {
                break;
            }
            if (Math.pow(approximateRoot, 2) < targetNum) {
                leftEdge = approximateRoot;
            } else {
                rightEdge = approximateRoot;
            }
        } while (true);
        System.out.println(approximateRoot);
    }
}
