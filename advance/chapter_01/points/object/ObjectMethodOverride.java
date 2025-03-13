import java.util.Objects;

class ObjectMethodOverride {
    public static void main(String[] args) {
        // インスタンスを2つ生成
        ObjectMethodOverride oneObject = new ObjectMethodOverride();
        ObjectMethodOverride anotherObject = new ObjectMethodOverride();
        // 同じ値を持たせる
        oneObject.setValue(100);
        anotherObject.setValue(100);
        // 等価性と参照アドレスの判定
        System.out.println(oneObject.equals(anotherObject)); // true
        System.out.println(oneObject == anotherObject); // false
    }

    private int value = 0;

    @Override
    public boolean equals(Object obj) {
        // nullチェックとインスタンスチェック
        if (obj == null || !(obj instanceof ObjectMethodOverride that)) {
            return false;
        }
        // 独自の等価性の定義
        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        // Objectsクラスのhashメソッドを用いる
        return Objects.hash(super.hashCode(), this.value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
