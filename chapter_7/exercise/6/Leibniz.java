class Leibniz {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of integer.");
            return;
        }
        int termsNum = Integer.parseInt(args[0]);
        double leibnizSum = 0;
        for (int i = 0; i < termsNum; i++) {
            leibnizSum += (Math.pow(-1, i)) / (2 * i + 1);
        }
        double piApproximation = 4 * leibnizSum;
        System.out.println(piApproximation);
    }
}
