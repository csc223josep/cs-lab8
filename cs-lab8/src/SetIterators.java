import java.util.HashSet;
import java.util.Iterator;

/**
 * This class demonstrates the use of an iterator to traverse a Set
 * and print out only the even elements.
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 */
public class SetIterators {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        HashSet<Integer> set = new HashSet<>();

        // Populate the set with numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }

        // Create an iterator for the set
        Iterator<Integer> iterator = set.iterator();
        
        // Iterate through the set using the iterator
        while (iterator.hasNext()) {
            int num = iterator.next();
            // Check if the number is even
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}