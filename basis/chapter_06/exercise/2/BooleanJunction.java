class BooleanJunction {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please execute with 2 arguments of boolean.");
            return;
        }
        boolean disjunction = Boolean.parseBoolean(args[0]) || Boolean.parseBoolean(args[1]);
        boolean conjunction = Boolean.parseBoolean(args[0]) && Boolean.parseBoolean(args[1]);
        String out = "答えは: " + disjunction;
        // String out = "答えは: " + conjunction;
        System.out.println(out);
    }
}
