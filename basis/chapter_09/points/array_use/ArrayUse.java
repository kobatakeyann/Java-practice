import java.util.Arrays;

class ArrayUse {
    public static void main(String[] args) {
        // 配列の宣言と作成
        int[] array = new int[5];
        array[0] = 3; // 代入
        System.out.println(Arrays.toString(array));
        // 配列の宣言と代入
        String[] words = {"apple", "banana", "cat"};
        System.out.println(Arrays.toString(words));
        // 2次元配列
        double[][] matrix = {{1.0, 3.5, 4, 2}, {3.4, 3, 5, 11.8}};
        System.out.println(Arrays.deepToString(matrix));
    }
}
