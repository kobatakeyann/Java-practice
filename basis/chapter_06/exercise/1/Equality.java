class Equality {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please execute with 2 arguments of number.");
            return;
        }
        boolean isEqualNumbers = Integer.parseInt(args[0]) == Integer.parseInt(args[1]);
        String out = "答えは：" + isEqualNumbers;
        System.out.println(out);
    }
}
