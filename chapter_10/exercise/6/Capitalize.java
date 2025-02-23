class Capitalize {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of sentence.");
            return;
        }
        String[] words = args[0].split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }
        System.out.println(String.join(" ", words));
    }
}
