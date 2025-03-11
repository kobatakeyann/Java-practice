package basis.chapter_15.points.downcast;

class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        // 共通メソッド
        cat.makeSound();
        dog.makeSound();
        // isinstance演算子を用いた安全なダウンキャスト
        if (dog instanceof Dog childClassInstance) {
            childClassInstance.attack(); // 子クラスしか持っていないメソッド
        }
    }
}
