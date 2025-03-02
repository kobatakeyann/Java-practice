package chapter_16.points;

public class Main {
    public static void main(String[] args) {
        // enum型の利用
        BloodType bloodType1 = BloodType.A;
        Gender gender = Gender.MALE;
        System.out.println(bloodType1);
        System.out.println(gender);
        // enum定数の取得
        String bloodTypeExample = "AB";
        BloodType bloodType2 = BloodType.valueOf(bloodTypeExample);
        System.out.println(bloodType2);
        // enum定数の文字列
        String yourBloodType = bloodType2.toString();
        System.out.println(yourBloodType);
        // 全enum定数の取得
        for (BloodType bloodType : BloodType.values()) {
            System.out.println(bloodType);
        }
        // enumクラスのメソッドの利用
        if (bloodType2.canDominateBlood()) {
            System.out.println("You can dominate blood today.");
        }
    }
}
