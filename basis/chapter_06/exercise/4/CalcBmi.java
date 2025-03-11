class CalcBmi {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please execute with 2 arguments of number.");
            return;
        }
        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);
        double bmi = weight / (height * height);
        String status;
        if (bmi < 18.5) {
            status = "瘦せすぎ";
        } else if (bmi < 25) {
            status = "標準";
        } else if (bmi < 30) {
            status = "太り気味";
        } else {
            status = "太りすぎ";
        }
        String message = String.format("あなたの健康状態: %s (BMI=%.5f)", status, bmi);
        System.out.println(message);
    }
}
