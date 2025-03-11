package basis.chapter_16.points;

import java.util.EnumSet;

public enum BloodType {
    // コンストラクタによるenum定数の定義
    A("A"), B("B"), O("O"), AB("AB");

    // privateなフィールド定数を定義したうえで、コンストラクタを定義する
    private final String bloodTypeName;

    private BloodType(String bloodType) {
        this.bloodTypeName = bloodType;
    }

    public String getBloodType() {
        return this.bloodTypeName;
    }

    // enum定数の部分集合定義
    private static final EnumSet<BloodType> typesCanDominateBlood = EnumSet.of(B, AB);

    public boolean canDominateBlood() {
        return typesCanDominateBlood.contains(this);
    }
}
