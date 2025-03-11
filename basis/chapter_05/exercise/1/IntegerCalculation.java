class IntegerCalculation {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with 2 arguments of number.");
            return;
        }
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int answer = firstNumber + secondNumber;
        // int answer = firstNumber - secondNumber;
        // int answer = firstNumber * secondNumber;
        // int answer = firstNumber / secondNumber;
        System.out.println(answer);
    }
}
