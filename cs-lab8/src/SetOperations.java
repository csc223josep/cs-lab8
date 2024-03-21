import java.util.HashSet;
import java.util.Set;

/**
 * This class demonstrates the use of Sets to perform Union, Intersection, and Difference operations.
 * 
 * The class populates two sets with integers and then performs union, intersection, and difference operations on them.
 * It prints out the original sets and the results of the operations.
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 */
public class SetOperations {
    public static void main(String[] args) {
        // Create two sets
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Create a second set
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Print the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union: Combine elements from both sets, removing duplicates
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection: Find common elements present in both sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (elements in Set1 but not in Set2): Find elements present in Set1 but not in Set2
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }
}
