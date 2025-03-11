import java.util.HashSet;
import java.util.Set;

class SetUse {
    public static void main(String[] args) {
        // HashSetの利用
        Set<String> cars = new HashSet<>();
        cars.add("乗用車");
        cars.add("トラック");
        cars.add("バス");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("パトカー"));
    }
}
