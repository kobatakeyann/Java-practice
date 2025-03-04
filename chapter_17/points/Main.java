package chapter_17.points;

class Main {
    public static void main(String[] args) {
        try {
            // 例外を発生させてみる
            tryThrowingException();
        } catch (MyOriginalException e) {
            System.out.println(e);
        }
    }

    public static void tryThrowingException() throws MyOriginalException {
        // 検査例外はthrowsキーワードで例外の伝播を宣言すると、try文は不要
        throw new MyOriginalException("自作例外クラスをthrowしました");
    }
}
