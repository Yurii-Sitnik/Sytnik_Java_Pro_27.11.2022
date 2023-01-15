package phonebook;

public class Record {
    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    String name;
    int number;


    public Record(String name, int number) {
        this.name = name;
        this.number = number;
    }
}


