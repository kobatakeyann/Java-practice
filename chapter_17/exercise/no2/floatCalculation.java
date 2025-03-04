class floatCalculation {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with 2 arguments of float number.");
            return;
        }
        double firstNumber, secondNumber;
        try {
            firstNumber = Double.parseDouble(args[0]);
            secondNumber = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("数値ではない値のため、計算できません。");
            return;
        }
        double answer = firstNumber + secondNumber;
        // double answer = firstNumber - secondNumber;
        // double answer = firstNumber * secondNumber;
        // double answer = firstNumber / secondNumber;
        System.out.println(answer);
    }
}
