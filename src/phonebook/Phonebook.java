package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    static List<Record> phoneBook = new ArrayList<>();

    public static void main(String[] args) {
        phoneBook.add(new Record("Anna", 556666));
        phoneBook.add(new Record("Anna", 5568635));
        phoneBook.add(new Record("Boris", 556677));
        phoneBook.add(new Record("Anton", 4433688));
        phoneBook.add(new Record("Anton", 4252799));

        System.out.println(find("Anna"));
        System.out.println(findAll("Anton"));
    }
    public static Record find(String name) {
        for (Record rec : phoneBook) {
            if (rec.getName().equals(name)) {
                return rec;
            }
        }
        return null;
    }
    public static String findAll(String name) {
        String n = " ";
        for (Record rec : phoneBook) {
            if (rec.getName().equals(name)) {
                n += "name: "+rec.getName()+"," + " number: "+rec.getNumber()+"\n";
            }
        }
        if (n == " ") {
            return null;
        } else return n;
    }
}



