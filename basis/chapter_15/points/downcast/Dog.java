package basis.chapter_15.points.downcast;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bow!");
    }

    public void attack() {
        System.out.println("You bited!!");
    }
}
