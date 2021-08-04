import java.util.Comparator;

public class ComparatorSalaryName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }
        if (o1.getName() == o2.getName()) {
            return 0;
        }
        return 1;
    }
}
