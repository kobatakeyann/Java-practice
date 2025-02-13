class Consecutive {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with argument of integer.");
            return;
        }
        int inputInteger = Integer.parseInt(args[0]);
        inputInteger--;
        System.out.print(inputInteger + " ");
        inputInteger++;
        System.out.print(inputInteger + " ");
        inputInteger++;
        System.out.println(inputInteger);
    }
}
