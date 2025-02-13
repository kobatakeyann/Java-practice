class Conversion {
    public static void main(String[] args) {
        String stringInteger = "53";
        String stringFloat = "3.14";
        // string to int
        int integer = Integer.parseInt(stringInteger);
        // string to float
        double floatNum = Double.parseDouble(stringFloat);
        System.out.println(integer);
        System.out.println(floatNum);
    }
}
