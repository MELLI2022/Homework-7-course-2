
import java.util.*;

public class Main {
    private static void displayOddNumbers(List<Integer> nums) {
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.println(number + "");
            }
        }
        System.out.println();
    }
    private static void displayEvenNumbers(List<Integer> nums){
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number + "");
            }
        }
        System.out.println();
    }
    private static void printUniqueWords(List<String>words){
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.println(word + "");
            }
        }
        System.out.println();


    }
    private static void removeDuplicateWords(List<String>words){
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words){
            if (!map.containsKey(word)){
                map.put(word, 1);
            }else {
                map.replace(word, map.get(word) +1);
            }
        }
        System.out.println(map);

    }



    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of( 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueWords(List.of("Words","Words", "words", "Word"));
        removeDuplicateWords(List.of("Words","Words", "words", "Word"));
displayOddNumbers(nums);
displayEvenNumbers(nums);

    }

}