import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This class demonstrates the use of lambda expressions and Java streams
 * to filter and map elements within a Set.
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 
 */
public class SetLambda {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        HashSet<Integer> set2 = new HashSet<>();

        // Populate the set with numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            set2.add(i);
        }
        
        // Print the initial set
        System.out.println(set2);
        
        // Filter even numbers and then map to square each number
        Set<Integer> squaredSet = set2.stream()
                                      .filter(i -> i % 2 == 0)          // Filter even numbers
                                      .map(i -> i * i)                  // Square each number
                                      .collect(Collectors.toSet());     // Collect the results into a new set
       
        squaredSet.forEach(System.out::println);
    }

}