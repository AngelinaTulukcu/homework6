import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5};


        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueElements.add(number)) {
                duplicates.add(number);
            }
        }

        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate elements:");
            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        } else {
            System.out.println("No duplicate elements");
        }
    }
}