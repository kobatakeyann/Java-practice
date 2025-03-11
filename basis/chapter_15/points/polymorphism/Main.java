package basis.chapter_15.points.polymorphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human japanese = new Japanase(); // 上位の抽象クラスの型とする
        Human american = new American(); // 上位の抽象クラスの型とする
        List<Human> people = List.of(japanese, american);
        for (Human man : people) {
            man.greet(); // 上位の抽象クラスの型にしておくことで子クラスの実装に依存しない記述ができる
        }
    }
}
