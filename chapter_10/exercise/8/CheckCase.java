class CheckCase {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of word.");
            return;
        }
        String inputWord = args[0];
        boolean isAllLowerCase = inputWord.equals(inputWord.toLowerCase());
        boolean hasUpperCaseInitial = Character.isUpperCase(inputWord.charAt(0));
        if (inputWord.contains("_")) {
            if (isAllLowerCase) {
                System.out.println("snake_case");
            } else {
                System.out.println("Input word is neither camelCase, snake_case, nor PascalCase.");
            }
            return;
        }
        if (hasUpperCaseInitial) {
            System.out.println("PascalCase");
        } else if (!isAllLowerCase) {
            System.out.println("camelCase");
        } else {
            System.out.println("Input word is neither camelCase, snake_case, nor PascalCase.");
        }
    }
}
