class FizzBuzz {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                output.append("FizzBuzz");
            } else if (i % 5 == 0) {
                output.append("Buzz");
            } else if (i % 3 == 0) {
                output.append("Fizz");
            } else {
                output.append(i);
            }
            String delimiter = (i != 100) ? "," : "";
            output.append(delimiter);
        }
        System.out.println(output);
    }
}
