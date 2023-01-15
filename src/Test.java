import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("pig");
        animals.add("cat");
        animals.add("horse");
        animals.add("parrot");
        animals.add("horse");
        animals.add("chicken");
        animals.add("sheep");
        animals.add("horse");
        animals.add("rabbit");
        animals.add("dog");
        animals.add("turtle");
        animals.add("dog");

        int[] array = new int[]{1, 2, 3, 4, 4, 5, 6, 8, 9};

        countOccurrence(animals, "dog");
        toList(array);
        calcOccurrence(animals);
        findOccurrence(animals);
    }

    public static void countOccurrence(List<String> arrayList, String string) {
        System.out.println(Collections.frequency(arrayList, string));
    }

    public static void toList(int[] array) {
        System.out.println("Array " + Arrays.toString(array));
        List<Integer> list = new ArrayList<>();
        for (Integer value : array) {
            list.add(value);
        }
        System.out.println("List " + list);
    }
    public static void calcOccurrence(List<String> arrayList) {
        Set<String> set = arrayList.stream().collect(Collectors.toSet());
        for (String i : set) {
            int count = Collections.frequency(arrayList, i);
            System.out.println(i + ": " + count);
        }
    }
    public static void findOccurrence(List<String> arrayList) {
        Set<String> value = arrayList.stream().collect(Collectors.toSet());
        for (String i : value) {
            int count = Collections.frequency(arrayList, i);
            System.out.println("name: " + i + " , " + "occurrence: "+ count);
        }
    }
}


