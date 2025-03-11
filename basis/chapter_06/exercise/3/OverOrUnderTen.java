class OverOrUnderTen {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of integer.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        if (num < 10) {
            System.out.println(num + "は10よりも小さいです");
            return;
        }
        if (num > 10) {
            System.out.println(num + "は10より大きいです");
            return;
        }
        System.out.println(num + "は10と同じ値です");
    }
}
