class Greet {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please execute with argument of username.");
            return;
        }
        String userName = args[0];
        String message = userName + "さん、こんにちは。";
        System.out.println(message);
    }
}
