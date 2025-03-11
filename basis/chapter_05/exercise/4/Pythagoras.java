class Pythagoras {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please execute with 2 arguments of float number.");
            return;
        }
        double sideA = Double.parseDouble(args[0]);
        double sideB = Double.parseDouble(args[1]);
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        String message = "斜辺の長さは" + hypotenuse;
        System.out.println(message);
    }
}
