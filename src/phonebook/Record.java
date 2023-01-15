package phonebook;

public class Record {
    String name;
    int number;

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
    public Record(String name, int number) {
        this.name = name;
        this.number = number;
    }
}


