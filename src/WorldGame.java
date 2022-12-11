import java.util.Random;
import java.util.Scanner;

public class WorldGame {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String newWord = words[random.nextInt(words.length)];
        System.out.println("input the world");
        for (int i = 2; i < words.length; i++) {
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.next().toLowerCase();
            if (str1.equals(newWord)) System.out.println("you win!!! Intended word " + newWord);
            else {
                String str2 = newWord.substring(0, i++);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 15; j++)
                    sb.append('#');
                System.out.println(str2 + sb.substring(str2.length()));
            }
        }
    }
}







