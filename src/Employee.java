public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private String surname;
    private double salary;
    private static int count;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = ++count;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        id = ++count;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public int compareTo(Employee o) {
//        return Integer.compare(this.id, o.id);
        if (this.id < o.id) {
            return -1;
        }
        if (this.id == o.id) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Имя : " + name +
                " Фамилия: " + surname +
                " id: " + id +
                " Зарплата сотрудника: " + salary + " грн.\n";


    }
}
