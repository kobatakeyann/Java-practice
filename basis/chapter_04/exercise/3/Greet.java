class Greet {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with 2 arguments of username and greeting.");
            return;
        }
        String userName = args[0];
        String greeting = args[1];
        System.out.println(userName + "さん、" + greeting + "。");
    }
}
