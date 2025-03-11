class Triangle {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of integer.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        while (num > 0) {
            System.out.println("*".repeat(num));
            num--;
        }
    }
}
