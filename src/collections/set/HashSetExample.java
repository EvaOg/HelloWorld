package collections.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Jane");
    set.add("Jack");
    set.add("Jane");
    set.add(null);

    for (String s : set) {
        System.out.println(s); //cannot use .get method
    }


        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);

        Set<Integer> set2 = Set.of(4,5,7,8);
        HashSet<Integer> hashSet3 = new HashSet<>(set2);
        System.out.println(hashSet3);

        //union
        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet3);
        System.out.println(union);

        //intersection
        HashSet<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet3);
        System.out.println(intersection);

        //subtract
        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.retainAll(hashSet3);
        System.out.println(subtract);

    }
}
