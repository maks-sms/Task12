import java.util.Comparator;

public class ComparatorSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }
        if (o1.getSalary() == o2.getSalary()) {
            return 0;
        }
        return 1;
    }
}
