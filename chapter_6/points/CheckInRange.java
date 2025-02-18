class CheckInRange {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        // 論理値
        boolean isMoreThanZero = num > 0;
        boolean isUnderHundred = num < 100;
        // 論理値は文字列に暗黙的に型変換される場合あり
        System.out.println(num + "は0と100の間か?: " + (isMoreThanZero && isUnderHundred));
    }
}
