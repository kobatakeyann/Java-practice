class CamelToSnake {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of word.");
            return;
        }
        String inputWord = args[0];
        boolean hasLowerCaseInitial = Character.isLowerCase(inputWord.charAt(0));
        boolean isAllLowerCase = inputWord.equals(inputWord.toLowerCase());
        boolean isCamelCase = (!inputWord.contains("_")) && hasLowerCaseInitial && !isAllLowerCase;
        if (!isCamelCase) {
            System.out.println("Input word is not camelCase.");
            return;
        }
        StringBuilder snakeCase = new StringBuilder();
        for (char s : inputWord.toCharArray()) {
            if (Character.isLowerCase(s)) {
                snakeCase.append(s);
            } else {
                snakeCase.append("_").append(Character.toLowerCase(s));
            }
        }
        System.out.println(snakeCase);
    }
}
