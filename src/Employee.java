public class Employee {
    private String id;
    private String jobTitle;
    private String email;
    private int phone;
    private int age;

    private Employee(String id, String jobTitle, String email, int phone, int age) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Bob","Developer","Bob@gmail.com",123456,25);
        System.out.println(employee);

    }
}
