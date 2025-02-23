class NumOfChars {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("please execute with an argument of sentence.");
            return;
        }
        String[] words = args[0].split(" ");
        int numOfChars = 0;
        for (String word : words) {
            numOfChars += word.length();
        }
        System.out.println("文字数は %d です。".formatted(numOfChars));
    }
}
