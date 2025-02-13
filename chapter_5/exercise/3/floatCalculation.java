class floatCalculation {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with 2 arguments of float number.");
            return;
        }
        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);
        double answer = firstNumber + secondNumber;
        // double answer = firstNumber - secondNumber;
        // double answer = firstNumber * secondNumber;
        // double answer = firstNumber / secondNumber;
        System.out.println(answer);
    }
}
