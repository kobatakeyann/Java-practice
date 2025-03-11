class ArrayLoop {
    public static void main(String[] args) {
        int[] scores = {1, 5, 3, 5, 9};
        // indexで参照
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 拡張for文
        for (int elem : scores) {
            System.out.println(elem);
        }
    }
}
